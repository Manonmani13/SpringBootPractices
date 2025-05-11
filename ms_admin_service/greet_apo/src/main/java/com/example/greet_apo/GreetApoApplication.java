package com.example.greet_apo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class GreetApoApplication {

	public static void main(String[] args) {
		SpringApplication.run(GreetApoApplication.class, args);
	}

}
