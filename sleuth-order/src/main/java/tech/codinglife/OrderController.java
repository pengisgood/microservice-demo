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
public class OrderController {

    @GetMapping("/order")
    public String getOrder(@RequestParam String name) {
        log.info("Order: return order info for {}", name);
        return "Hi " + name + ", you have an 3 orders";
    }
}
