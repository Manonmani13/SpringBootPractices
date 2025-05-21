package com.example.sb_redis_cache;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;



@Controller
public class UserController {

    private UserServiice userServiice;

    public UserController(UserServiice userServiice){
        this.userServiice=userServiice;
    }

    @PostMapping("/user")
    public String add(@RequestBody User entity) {
        
        return userServiice.addUser(entity);
    }

    @GetMapping("/user/{userId}")
    public User getMethodName(@PathVariable Integer userId) {
        return userServiice.getUser(userId);
    }
    
    
    
}
