package com.vehicleconfig.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.vehicleconfig.entities.Authentication;
import com.vehicleconfig.services.AuthenticationManager;



@RestController
@CrossOrigin("http://localhost:3000")
public class AuthenticationController {
	@Autowired
	AuthenticationManager manager;
	
	@GetMapping(value = "api/authentications")
	public List<Authentication> allAuthentications(){
		return manager.getAll();
	}
	
	@GetMapping(value="api/authenticationById/{sid}")
	public Optional<Authentication> getAuthenticationById(@PathVariable int sid){
		Optional<Authentication> p=manager.get(sid);
		return p;
	}
	
	@PostMapping(value="api/authentication")
	public void addAuthentication(@RequestBody Authentication authentication){
		System.out.println("PostAuth");
		System.out.println(authentication);
		manager.add(authentication);
		System.out.println("Authentication Added");
	}
	
	@DeleteMapping(value="api/authentication/{sid}")
	public void removeAuthentication(@PathVariable int sid){
		manager.delete(sid);
	}
	
	 @PutMapping(value = "api/authentication/{sid}")
	 public void updateAuthentication(@RequestBody Authentication authentication,@PathVariable int sid)
	 {
		System.out.println("inside update Authentication of controller");
		manager.update(authentication,sid);
	 }

}
