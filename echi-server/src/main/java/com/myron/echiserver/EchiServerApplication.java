package com.myron.echiserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class EchiServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EchiServerApplication.class, args);
	}
}
