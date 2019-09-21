package com.example.demo.controller;

import org.slf4j.Logger;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class UserController {
	// Logger logger = Logger.getLogger(UserController.class.getName()); 
	@RequestMapping(value="/user",method=RequestMethod.GET)
	public ResponseEntity<String> getUser(){
		RestTemplate restTemplate=new RestTemplate();
		//String response=new ResponseEntity<String>(null);
		ResponseEntity<String> response=restTemplate.getForEntity("http://45.249.123.229:8080/login", String.class);
		//ResponseEntity<String> response=restTemplate.getForEntity("https://gturnquist-quoters.cfapps.io/api/random", String.class);
		System.out.println("Response"+response);
		return response;
	}
	
}
