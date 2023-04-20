package com.vehicleconfig.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vehicleconfig.entities.VehicleMaster;
import com.vehicleconfig.repositories.VehicleMasterRepository;

@Service
public class VehicleMasterManagerImpl implements VehicleMasterManager
{
	@Autowired
	
	VehicleMasterRepository repository;

	
	
	@Override
	public void add(VehicleMaster veh) 
	{
		repository.save(veh);
		
	}

	@Override
	public List<VehicleMaster> getAll() {
		return repository.findAll();
	}

	@Override
	public void delete(int id) {
		repository.deleteById(id);
		
	}

	@Override
	public void update(VehicleMaster vehicle, int id)
	{
		
		repository.update(vehicle.getCompType(),vehicle.getIsConfigurable(),id);
		
	}

	@Override
	public List<?> get(int id) {
		return repository.findVehbyId(id);
	}

}
