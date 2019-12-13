package tech.codinglife.service;

import org.springframework.stereotype.Component;

@Component
public class HiError implements FeignService {
    @Override
    public String hi() {
        return "出错了，:(";
    }
}
