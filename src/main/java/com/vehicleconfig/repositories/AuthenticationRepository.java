package com.vehicleconfig.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vehicleconfig.entities.Authentication;

public interface AuthenticationRepository extends JpaRepository<Authentication,Integer> 
{
	

}
