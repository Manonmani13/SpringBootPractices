package com.example.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.model.Users;
import com.example.service.UserServic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class UserController {

    @Autowired
    UserServic userServic;

    @PostMapping("/add")
    public void addUser(@RequestBody Users entity) {
        userServic.addUSer(entity);
    }
    
    
}
