package com.example.config_server_client_app;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class DataRestController {

    @GetMapping("/data")
    @HystrixCommand
    public String getMethodName(@RequestParam String param) {
        return new String();
    }
    
    
}
