package com.spring.example;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class MessageController {

    @GetMapping("/welcome")
    public String getMethodName( Model model) {
        model.addAttribute("msg","Welcome To Thymleaf App");
        return "index";
    }
    
    
}
