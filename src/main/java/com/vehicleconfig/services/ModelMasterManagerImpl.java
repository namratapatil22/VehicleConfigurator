package com.vehicleconfig.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vehicleconfig.entities.ModelMaster;
import com.vehicleconfig.repositories.ModelMasterRepository;

@Service
public class ModelMasterManagerImpl implements ModelMasterManager
{
	
	@Autowired
	ModelMasterRepository repository;

	@Override
	public void add(ModelMaster model) 
	{
		repository.save(model);
		
	}

	@Override
	public List<ModelMaster> getAll() {
		return repository.findAll();
	}

	@Override
	public void delete(int id) {
		repository.deleteById(id);
	
		
	}

	@Override
	public void update(ModelMaster models, int id) 
	{
		
		
	}

	@Override
	public List<ModelMaster> get(int id) {
		
		return repository.findByManuf(id);
	}

}
