package tech.codinglife;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by IntelliJ IDEA.
 * Author: maxpeng
 * Date: 2019/11/30
 * Time: 4:28 PM
 */
@FeignClient("sleuth-notification")
public interface NotificationClient {

    @GetMapping("/notification")
    String getNotification(@RequestParam String name);
}
