package com.example.rest_api_exception_hanlding;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class CustomerRestController {

    private CustomerService service;

    @GetMapping("/customer/{customerId}")
    public String getMethodName(@PathVariable Integer customerId)  throws RuntimeException{
        if(customerId>=100){
            return "John";
        }else{
            throw new CustomNotFouncdExceptioin("Invalid Customer Id");

        }
    }

    @GetMapping("/customers/{custID}")
    public String getCustomer(@PathVariable Integer customerId)  throws RuntimeException{
        return service.getCustomerById(customerId);
    }
    
    
    
}
