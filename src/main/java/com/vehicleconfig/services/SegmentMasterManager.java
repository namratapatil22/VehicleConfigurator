package com.vehicleconfig.services;

import java.util.List;
import java.util.Optional;

import com.vehicleconfig.entities.SegmentMaster;

public interface SegmentMasterManager 
{
	
	void add(SegmentMaster seg);
	List<SegmentMaster> getAll();
	void delete (int id);
	void update(SegmentMaster segment,int segid);
	Optional<SegmentMaster> get(int id);
	
	
	

	
	
}
