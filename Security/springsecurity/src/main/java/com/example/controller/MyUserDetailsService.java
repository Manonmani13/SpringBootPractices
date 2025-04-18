package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.example.model.Users;
import com.example.repo.UserDetailsRepo;

public class MyUserDetailsService implements UserDetailsService {


    @Autowired
    UserDetailsRepo repo;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        // TODO Auto-generated method stub
        Users user=repo.getByUserName(username);
        if(user== null){
            throw new UsernameNotFoundException("User Not Found");
        }
        return UserPrincipal(user);

    }
    
}
