package com.vehicleconfig.services;

import java.util.List;
import java.util.Optional;

import com.vehicleconfig.entities.ComponentMaster;



public interface ComponentMasterManager 
{
	void add(ComponentMaster comp);
	List<ComponentMaster> getAll();
	void delete (int id);
	void update(ComponentMaster compt,int id);
	Optional<ComponentMaster> get(int id);

}
