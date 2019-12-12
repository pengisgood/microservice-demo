package tech.codinglife;

import com.netflix.appinfo.ApplicationInfoManager;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class TestController {
    private final ApplicationInfoManager infoManager;

    public TestController(ApplicationInfoManager infoManager) {
        this.infoManager = infoManager;
    }

    @GetMapping("hi")
    public String hi() {
        String ipAddr = infoManager.getInfo().getIPAddr();
        int port = infoManager.getInfo().getPort();
        return "Hi from: " + ipAddr + ":" + port;
    }
}
