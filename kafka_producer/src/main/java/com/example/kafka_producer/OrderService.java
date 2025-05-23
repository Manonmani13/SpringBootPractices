package com.example.kafka_producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired
    private KafkaTemplate<String,Order> kafkaTemplate;

    public String addMsg(Order order){
        kafkaTemplate.send(AppConstant.TOPIC,order);
        return "MSg Published  To Kakfa Topic";
    }
    
}
