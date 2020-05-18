package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	
	@Value("${name}")
	private String username;
	
	@Value("${age}")
	private Integer age;
	
	@Value("${role}")
	private String role;
	
	@Value("${team}")
	private String team;

	@GetMapping("/getUsername")
	public String getUserName() {
		return username + " " + age + " "+ role + " "+team;
	}
}
