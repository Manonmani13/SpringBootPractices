package com.example.sb_rest_makemytrip_app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SbRestMakemytripAppApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context= SpringApplication.run(SbRestMakemytripAppApplication.class, args);

		MakeMyTripService bean=context.getBean(MakeMyTripService.class);
		bean.getTicketInfoSync("161");
		
	}

}
