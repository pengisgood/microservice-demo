package tech.codinglife.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "eureka-client", fallback = HiError.class)
public interface FeignService {

    @GetMapping("/hi")
    String hi();
}
