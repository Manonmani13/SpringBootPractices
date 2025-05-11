package com.example.ms_welcome_api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name="GREET_API")
public interface GreetFeignclient {

    @GetMapping("/greet")
    public String invokeGreetApi();
    
}
