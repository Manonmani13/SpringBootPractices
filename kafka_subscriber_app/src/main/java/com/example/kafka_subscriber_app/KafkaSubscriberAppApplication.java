package com.example.kafka_subscriber_app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.annotation.Order;
import org.springframework.kafka.annotation.KafkaListener;

@SpringBootApplication
public class KafkaSubscriberAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(KafkaSubscriberAppApplication.class, args);
	}

	@KafkaListener(topics=AppConstant.TOPIC)
	public void subscribeMsg(Order order){
		System.out.println("*** Msg Received from kafka ***");
		System.out.println(order);
	}

}
