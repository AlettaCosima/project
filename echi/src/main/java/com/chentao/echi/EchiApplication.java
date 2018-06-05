package com.chentao.echi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class EchiApplication {

	public static void main(String[] args) {
		SpringApplication.run(EchiApplication.class, args);
	}
}
 
