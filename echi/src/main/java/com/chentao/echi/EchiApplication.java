package com.chentao.echi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@RefreshScope
@SpringBootApplication
@EnableEurekaClient
public class EchiApplication {

	public static void main(String[] args) {
		SpringApplication.run(EchiApplication.class, args);
	}
}
 
