package com.vehicleconfig.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vehicleconfig.entities.Authentication;
import com.vehicleconfig.repositories.AuthenticationRepository;



@Service
public class AuthenticationManagerImpl implements AuthenticationManager {
	@Autowired
	AuthenticationRepository repository;
	
	@Override
	public void add(Authentication p) {
		repository.save(p);
	}

	@Override
	public List<Authentication> getAll() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
	}

	@Override
	public void update(Authentication authentication, int id) {
		// TODO Auto-generated method stub
		System.out.println("Yet to define");
	}

	@Override
	public Optional<Authentication> get(int id) {
		// TODO Auto-generated method stub
		return repository.findById(id);
	}

}
