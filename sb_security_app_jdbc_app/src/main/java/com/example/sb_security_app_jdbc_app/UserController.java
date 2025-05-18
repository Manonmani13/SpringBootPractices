package com.example.sb_security_app_jdbc_app;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class UserController {

    @GetMapping(value="/admin")
    public String admin() {
        return "<h3> Welcome Admin </h3>";
    }

    @GetMapping(value="/user")
    public String user() {
        return "<h3> Hello User:) </h3>";
    }
    
    @GetMapping(value="/")
    public String welcome() {
        return "<h3> Welcome:) </h3>";
    }
    
}
