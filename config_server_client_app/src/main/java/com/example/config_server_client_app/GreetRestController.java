package com.example.config_server_client_app;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RefreshScope
public class GreetRestController {

    @Value("${msg}")
    private String msg;

    @GetMapping("/")    
    public String greetMSg(){
        return msg;
    }
    
}
