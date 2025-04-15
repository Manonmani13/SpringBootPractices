package com.first.runners;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import ch.qos.logback.classic.joran.action.ConfigurationAction;

@SpringBootApplication
public class RunnersApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context= SpringApplication.run(RunnersApplication.class, args);
		ReportService reportService=context.getBean(ReportService.class);
		reportService.printName(100);
	}

}
