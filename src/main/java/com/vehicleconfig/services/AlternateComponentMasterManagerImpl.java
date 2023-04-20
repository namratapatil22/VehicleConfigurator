package com.vehicleconfig.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vehicleconfig.entities.AlternateComponentMaster;
import com.vehicleconfig.repositories.AlternateComponentMasterRepository;
@Service
public class AlternateComponentMasterManagerImpl implements  AlternateComponentMasterManager
{
	@Autowired
	AlternateComponentMasterRepository repository;

	@Override
	public void add(AlternateComponentMaster altcomps)
	{
		repository.save(altcomps);
	
		
	}

	@Override
	public List<AlternateComponentMaster> getAll() {
		
		return repository.findAll();
	}

	@Override
	public void delete(int id) {
		repository.deleteById(id);
		
		
	}

	@Override
	public void update(AlternateComponentMaster altcomp, int id) {
	
		
	}

	@Override
	public List<?> get(int id) {
	
		return  repository.findAltById(id);
	} 

}
