package com.vehicleconfig.services;

import java.util.List;
import java.util.Optional;

import com.vehicleconfig.entities.MfgMaster;


public interface MfgMasterManager
{
	void add(MfgMaster mfg);
	List<MfgMaster> getAll();
	void delete (int id);
	void update(MfgMaster mfgmaster,int segid);
	List<MfgMaster> get(int id);
	

}
