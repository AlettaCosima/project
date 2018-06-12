package com.chentao.echi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RestController
public class UserController {
	
	@Autowired
    private RestTemplate restTemplate;
	
	@GetMapping("user/hello/")
	@HystrixCommand(fallbackMethod = "hasError")
    public String hello() {
		return this.restTemplate.getForObject("http://localhost:8081/hello", String.class);
    }
	
	public String hasError() {
		return "出错了！";
	}
	

}
