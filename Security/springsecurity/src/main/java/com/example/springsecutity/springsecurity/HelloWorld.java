package com.example.springsecutity.springsecurity;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletRequest;

@RestController
public class HelloWorld {

    @GetMapping("/hello")
    public String hello() {
        return "Hello World";
    }

    @GetMapping("/")
    public String home(HttpServletRequest httpClient) {
        return "Home Page "+httpClient.getSession().getId();
    }

    @GetMapping("/about")
    public String aboutUs() {
        return "CONQUER VICTORY";
    }
    
    
}
