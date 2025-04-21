package com.webmvcformapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.HttpRequestHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.webmvcformapp.webmvcformapp.User;

import ch.qos.logback.core.model.Model;
import jakarta.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@Controller
public class UserController {


    @GetMapping("/")
    public String loadForm(HttpServletRequest req) {
        return "index";
    }
    
    @PostMapping("/user")
    public String handleSubmitBtn(User user,Model model ) {
       System.out.println(user);
        model.addAttribute("msg","User Saved");

        return "index";
    }
    
    
}
