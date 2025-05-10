package com.example.sb_actuators;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class GreetController {

    @GetMapping("/greet")
    public String getMethodName() {
        return "Good Evening";
    }
    
    
}
