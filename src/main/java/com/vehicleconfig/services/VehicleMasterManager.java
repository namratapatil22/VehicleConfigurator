package com.vehicleconfig.services;

import java.util.List;
import java.util.Optional;


import com.vehicleconfig.entities.VehicleMaster;

public interface VehicleMasterManager 
{
	
	void add(VehicleMaster veh);
	List<VehicleMaster> getAll();
	void delete (int id);
	void update(VehicleMaster vehicle,int id);
	List<?> get(int id);

}
