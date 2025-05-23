package com.example.kafka_producer;

import java.util.HashMap;
import java.util.Map;

import org.apache.kafka.clients.producer.ProducerConfig;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.core.Ordered;
import org.springframework.kafka.core.DefaultKafkaProducerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.core.ProducerFactory;

import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.ser.std.StringSerializer;

@Configurable
public class KafkaProducerConfig {

    @Bean
    public ProducerFactory<String,Order> producerFactory(){
        Map<String,Object> confMap=new HashMap<>();
        confMap.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, AppConstant.HOST);
        confMap.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class);
        confMap.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, JsonSerializer.class);
        return new DefaultKafkaProducerFactory<>(confMap);

    }

    @Bean
    public KafkaTemplate<String,Order> kafkaTemplate(){
        return new KafkaTemplate<>(producerFactory());
    }
    
}
