package com.vehicleconfig.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vehicleconfig.entities.MfgMaster;
import com.vehicleconfig.repositories.MfgMasterRepository;


@Service
public class MfgMasterManagerImpl implements MfgMasterManager{

	
	@Autowired
	MfgMasterRepository repository;

	
	@Override
	public void add(MfgMaster mfg) {
		repository.save(mfg);
		
		
	}

	@Override
	public List<MfgMaster> getAll() {
		
		return repository.findAll();
	}

	@Override
	public void delete(int id) {
	
		repository.deleteById(id);
	}

	@Override
	public void update(MfgMaster mfgmaster, int segid) {
	
	
		
	}

	@Override
	public List<MfgMaster> get(int id) 
	{
		System.out.println("mfgmaster"+id);
	
		return repository.findBySeg(id);
	}

}
