package com.devops.DevopsApplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class DevopsApplication {


	public static void main(String[] args) {
		System.out.println(" Devops Application is starting on date "+new Date());
		SpringApplication.run(DevopsApplication.class, args);
	}

}
