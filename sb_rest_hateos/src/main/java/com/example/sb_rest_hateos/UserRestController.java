package com.example.sb_rest_hateos;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
public class UserRestController {

    @GetMapping("/user")
    public ResponseEntity<User> getUser() {
        User user=new User(101,"john","john@gmail.com");
        user.add(linkTo(methodOn(UserRestController.class).getUser()).withSelfRel());
        return new ResponseEntity<>(user,HttpStatus.OK);
    }


    @PostMapping("/user")
    public ResponseEntity<User> createUSer(@RequestBody User user) {
        
        return new ResponseEntity<>(user,HttpStatus.OK);
    }

    @PutMapping("/user")
    public ResponseEntity<User> updateUSer(@RequestBody User user) {
        
        return new ResponseEntity<>(user,HttpStatus.OK);
    }

    @DeleteMapping("/user/{id}")
    public ResponseEntity<String> deleteUser(@PathVariable Integer id) {
        
        return new ResponseEntity<>("Deleted",HttpStatus.OK);
    }
    
    
}
