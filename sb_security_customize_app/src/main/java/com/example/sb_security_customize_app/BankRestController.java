package com.example.sb_security_customize_app;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class BankRestController {

    @GetMapping("/balance")
    public String balance() {
        return "Your Balance :: 7898.90 INR";
    }
    
    @GetMapping("/balance")
    public String amrTransfer() {
        return "Your Amount  Transfer Successfull";
    }
    
    @GetMapping("/login")
    public String login() {
        return "Your Login Success";
    }

     @GetMapping("/login")
    public String contact() {
        return "Contact US";
    }
    
    
}
