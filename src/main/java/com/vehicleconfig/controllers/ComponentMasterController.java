package com.vehicleconfig.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.vehicleconfig.entities.ComponentMaster;
import com.vehicleconfig.services.ComponentMasterManager;

@RestController  
@CrossOrigin("http://localhost:3000")
public class ComponentMasterController
{

	@Autowired
	ComponentMasterManager manager;
	
	
	 @GetMapping(value = "api/components")
	 public List<ComponentMaster> showComponents()
	 {
		  return manager.getAll(); 
		
	 }
	
	 @GetMapping(value = "api/compsById/{id}")
	 public Optional<ComponentMaster> getComp(@PathVariable int id)
	 {
		Optional<ComponentMaster> cm=manager.get(id);
		return cm;
	 }
	 
	 @DeleteMapping(value = "api/comp/{id}")
	 public void removeComp(@PathVariable int id)
	 {
		manager.delete(id);
	 }
	 @PutMapping(value = "api/compoput/{id}")
	 public void updateComp(@RequestBody ComponentMaster comp,@PathVariable int id)
	 {
		System.out.println("inside updatecomponent of controller");
		manager.update(comp,id);
	 }
	 @PostMapping(value ="api/componentpost")
	 public void addSeg(@RequestBody ComponentMaster comps)
	 {
		System.out.println("addComponent called");
		manager.add(comps);
	 }
	
	
	
	

}
