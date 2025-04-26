package com.interceptor.interceptor;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;


@Controller
@ResponseBody

public class MessageController {

    @GetMapping("/welcome")
    public String getMethodName() {
        return "Welcome to Ashok IT";
    }
    
    @GetMapping("/greet")
    public String greetMsg() {
        return "Good Evening .... !";
    }

    @ExceptionHandler(value=ArithmeticException.class)
    public ModelAndView handleAE(ArithmeticException ex){
        String msg=ex.getMessage();
        ModelAndView mav=new ModelAndView();
        mav.setViewName("error");
        return mav;
    }
    
}
