package com.vehicleconfig.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.vehicleconfig.entities.ModelMaster;
import com.vehicleconfig.services.ModelMasterManager;

@RestController  
@CrossOrigin("http://localhost:3000")
public class ModelMasterController 
{
	@Autowired
	ModelMasterManager manager;
	
	
	 @GetMapping(value = "api/models")
	 public List<ModelMaster> showManufacturers()
	 {
		  return manager.getAll(); 
		
	 }
	
	 @GetMapping(value = "api/modelsById/{id}")
	 public List<ModelMaster> getModels(@PathVariable int id)
	 {
		List<ModelMaster> mm=manager.get(id);
		return mm;
	 }
	 
	 @DeleteMapping(value = "api/mdls/{id}")
	 public void removeModels(@PathVariable int id)
	 {
		manager.delete(id);
	 }
	 @PutMapping(value = "api/mdlput/{id}")
	 public void updatemodel(@RequestBody ModelMaster model,@PathVariable int id)
	 {
		System.out.println("inside updatemodels of controller");
		manager.update(model,id);
	 }
	 @PostMapping(value ="api/modelpost")
	 public void addSeg(@RequestBody ModelMaster mdls)
	 {
		System.out.println("addManufactures called");
		manager.add(mdls);
	 }
	
	

}
