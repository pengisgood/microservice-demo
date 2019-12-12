package tech.codinglife;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tech.codinglife.service.FeignService;
import tech.codinglife.service.RestTemplateService;

@RestController
@RequestMapping
public class TestController {
    private final RestTemplateService restTemplateService;
    private final FeignService feignService;

    public TestController(RestTemplateService restTemplateService, FeignService feignService) {
        this.restTemplateService = restTemplateService;
        this.feignService = feignService;
    }

    @GetMapping("rest-template")
    public String testRestTemplate() {
        return "[REST TEMPLATE] " + restTemplateService.hi();
    }

    @GetMapping("feign")
    public String testFeign() {
        return "[FEIGN] " + feignService.hi();
    }
}
