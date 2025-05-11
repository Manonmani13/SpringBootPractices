package com.example.ms_welcome_api;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class WelcomeRestController {

    @Autowired
    private GreetFeignclient greetFeignclient;

    @GetMapping("/welcome")
    public String getMethodName() {

        String greeString=greetFeignclient.invokeGreetApi();
        return greeString+ " Welcome To ashok IT";
    }
    
    
}
