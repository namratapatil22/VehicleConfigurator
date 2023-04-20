package com.vehicleconfig.services;

import java.util.List;
import java.util.Optional;

import com.vehicleconfig.entities.Authentication;



public interface AuthenticationManager {
	void add(Authentication p);
	List<Authentication> getAll();
	void delete(int id);
	void update(Authentication authentication,int id);
	Optional<Authentication> get(int id);
}
