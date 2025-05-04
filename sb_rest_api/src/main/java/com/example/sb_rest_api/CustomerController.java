package com.example.sb_rest_api;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class CustomerController {

    @GetMapping(value="/customer", consumes = {"application/xml","application/json"},produces ={"text/plain"})
    public Customer getCustomer() {
        Customer c=new Customer();
        c.setName("mano");
        c.setEmail("john@gmail.com");
        c.setGender("Female");
        return c;
    }
    
    
}
