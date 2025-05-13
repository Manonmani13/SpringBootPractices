package com.example.ms_welcome_api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class GreetController {

    @Autowired
    private Environment env;

    

    @GetMapping("/greet")
    public String getGreetMsg() {
        String port=env.getProperty("server.port");
        return "Good Evening "+port;
    }
    
    
}
