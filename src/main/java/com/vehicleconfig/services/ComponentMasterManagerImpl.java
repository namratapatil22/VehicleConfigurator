package com.vehicleconfig.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vehicleconfig.entities.ComponentMaster;
import com.vehicleconfig.repositories.ComponentMasterRepository;

@Service
public class ComponentMasterManagerImpl implements ComponentMasterManager 
{
	@Autowired
	ComponentMasterRepository repository;

	
	@Override
	public void add(ComponentMaster comp)
	{
		repository.save(comp);
	}

	@Override
	public List<ComponentMaster> getAll() {
	
		return repository.findAll();
	}

	@Override
	public void delete(int id) 
	{
		repository.deleteById(id);
	}

	@Override
	public void update(ComponentMaster compt, int id)
	{
		repository.update(compt.getCompName(),id);
	}

	@Override
	public Optional<ComponentMaster> get(int id) 
	{
	
		return repository.findById(id);
	}

}
