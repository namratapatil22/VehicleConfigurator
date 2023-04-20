package com.vehicleconfig.services;

import java.util.List;

import com.vehicleconfig.entities.ModelMaster;



public interface ModelMasterManager 
{
	void add(ModelMaster mfg);
	List<ModelMaster> getAll();
	void delete (int id);
	void update(ModelMaster models,int id);
	List<ModelMaster> get(int id);
	

}
