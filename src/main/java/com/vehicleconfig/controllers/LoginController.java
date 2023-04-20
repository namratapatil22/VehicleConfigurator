package com.vehicleconfig.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vehicleconfig.entities.Authentication;
import com.vehicleconfig.entities.LoginRequest;
import com.vehicleconfig.entities.LoginResponse;
import com.vehicleconfig.repositories.AuthenticationRepository;

@RestController
@RequestMapping("/api")
@CrossOrigin("http://localhost:3000")
public class LoginController 
{
	@Autowired
    private AuthenticationRepository authentication;

    @PostMapping("/login")
    public ResponseEntity<LoginResponse> login(@RequestBody LoginRequest request) {
        Authentication person = authentication.findAll().stream()
	            .filter(user -> user.getEmailId().equals(request.getEmailId()) && user.getPassword().equals(request.getPassword()))
	            .findFirst()
	            .orElse(null);;
        if (person != null && person.getEmailId().equals(request.getEmailId()) && person.getPassword().equals(request.getPassword())) {
            return ResponseEntity.ok(new LoginResponse(true));
        }
        return ResponseEntity.ok(new LoginResponse(false));
    }

}
