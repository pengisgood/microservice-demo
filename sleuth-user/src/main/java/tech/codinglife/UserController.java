package tech.codinglife;

import brave.Tracer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by IntelliJ IDEA.
 * Author: maxpeng
 * Date: 2019/11/29
 * Time: 11:06 AM
 */
@Slf4j
@RestController
public class UserController {
    private final NotificationClient notificationClient;
    private final OrderClient orderClient;
    private final Tracer tracer;

    public UserController(NotificationClient notificationClient, OrderClient orderClient, Tracer tracer) {
        this.notificationClient = notificationClient;
        this.orderClient = orderClient;
        this.tracer = tracer;
    }

    @GetMapping("/home")
    public String home(@RequestParam String name) {
        log.info("User: get notification for {}", name);
        String notification = notificationClient.getNotification(name);

        log.info("User: get order for {}", name);
        String order = orderClient.getOrder(name);

        return notification + "\n" + order;
    }
}
