package com.example.kafka_producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class OrderRestController {

    @Autowired
    private OrderService orderService;


    @PostMapping("/order")
    public String createOrder(@RequestBody Order entity) {
        //TODO: process POST request
        String str=orderService.addMsg(entity);
        return str;
    }
    
    
}
