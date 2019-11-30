package tech.codinglife;

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
public class NotificationController {

    @GetMapping("/notification")
    public String getNotification(@RequestParam String name) {
        log.info("Notification: return notification for {}", name);
        return "Hi " + name + ", you have 1 message.";
    }
}
