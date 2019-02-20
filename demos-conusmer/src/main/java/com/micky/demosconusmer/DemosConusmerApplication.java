package com.micky.demosconusmer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class DemosConusmerApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemosConusmerApplication.class, args);
	}

}

