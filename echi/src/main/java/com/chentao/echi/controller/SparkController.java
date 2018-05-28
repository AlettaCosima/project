package com.chentao.echi.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/spark")
public class SparkController {
	@Value("${neo}")
	private String password;
	
	@RequestMapping("/password")
    public String from() {
        return this.password;
    }
	

}
