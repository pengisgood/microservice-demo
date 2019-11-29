package tech.codinglife;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by IntelliJ IDEA.
 * Author: maxpeng
 * Date: 2019/11/29
 * Time: 11:06 AM
 */
@RestController
@RefreshScope
public class TestController {

    @Value("${foo}")
    private String foo;

    @GetMapping("/foo")
    public String foo() {
        return foo;
    }
}
