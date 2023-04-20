package com.vehicleconfig.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.vehicleconfig.entities.AlternateComponentMaster;



public interface AlternateComponentMasterManager
{
	void add(AlternateComponentMaster altcomps);
	List<AlternateComponentMaster> getAll();
	void delete (int id);
	void update(AlternateComponentMaster altcomp,int id);
	List<?> get(int id);
}
