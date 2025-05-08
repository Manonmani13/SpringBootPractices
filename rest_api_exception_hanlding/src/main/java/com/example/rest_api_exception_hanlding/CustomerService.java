package com.example.rest_api_exception_hanlding;

import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    public String getCustomerById(Integer customerId) {
        if(customerId>=100){
            return "John";
        }else{
            throw new CustomNotFouncdExceptioin("Invalid Customer Id");

        }
    }
    
}
