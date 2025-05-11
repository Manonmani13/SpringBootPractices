package com.example.ms_admin_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import de.codecentric.boot.admin.server.config.EnableAdminServer;

@SpringBootApplication
@EnableAdminServer
public class MsAdminServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsAdminServiceApplication.class, args);
	}

}
