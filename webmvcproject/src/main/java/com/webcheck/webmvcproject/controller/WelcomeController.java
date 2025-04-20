package com.webcheck.webmvcproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;

import jakarta.websocket.server.PathParam;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class WelcomeController {

    @GetMapping("/welcome")
    public ModelAndView getWelcomeMsg(){
            ModelAndView mav=new ModelAndView();
            mav.addObject("msg", "Welcoome User!!!");
            mav.setViewName("index");
            return mav;
        }
    

    @GetMapping("/book")
    public ModelAndView getBookData(@RequestParam String name, String author){

            ModelAndView mav=new ModelAndView();
            mav.addObject("msg", name +" By "+author+" is out of  stock");
            mav.setViewName("index");
            return mav;
        }
    
        
    @GetMapping("/stock/{brand}/location/{loc}")
    public ModelAndView getStock(@PathParam("brand") String brand, @PathParam("loc") String loc){

            ModelAndView mav=new ModelAndView();
            mav.addObject("msg", loc+" By "+brand+" is out of  stock");
            mav.setViewName("index");
            return mav;
        }

}
