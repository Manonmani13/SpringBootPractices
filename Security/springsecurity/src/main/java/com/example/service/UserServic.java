package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.example.model.Users;
import com.example.repo.UserDetailsRepo;

public class UserServic {

    BCryptPasswordEncoder bCryptPasswordEncoder=new BCryptPasswordEncoder(12);

    @Autowired
    UserDetailsRepo repo;

    public void addUSer(Users user){
        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        repo.save(user);
    }
    
}
