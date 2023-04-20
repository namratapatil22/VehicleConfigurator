package com.vehicleconfig.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("http://localhost:3000")
public class HelloWorldController {
	
	@GetMapping("/Hello")
	public String index(){
		return "Hello Rohit";
	}
}
  