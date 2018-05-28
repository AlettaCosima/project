package com.chentao.echi.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SparkController {
	@Value("${neo}")
	private String password;
	
	@RequestMapping("/password")
    public String from() {
        return this.password;
    }
	

}
