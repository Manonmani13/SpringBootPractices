package com.example.spring_security_basic_auth;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class MsgController {
    
    @GetMapping("/")
    public String getMsg() {
        return "Hello world";
        }
    
}
