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

import com.vehicleconfig.entities.AlternateComponentMaster;
import com.vehicleconfig.services.AlternateComponentMasterManager;



@RestController  
@CrossOrigin("http://localhost:3000")
public class AlternateComponentMasterController
{

	@Autowired
	AlternateComponentMasterManager manager;
	
	
	 @GetMapping(value = "api/altcomps")
	 public List<AlternateComponentMaster> showAltComponents()
	 {
		 
		  return manager.getAll(); 
		
	 }
	
	 @GetMapping(value = "api/altcompsById/{id}")
	 public List<?> getAltComp(@PathVariable int id)
	 {
		 if(manager.get(id)==null)
		 {
			 throw new NullPointerException();
		 }
		 List<?> al=manager.get(id);
		return al;
	 }
	 
	 @DeleteMapping(value = "api/altcomp/{id}")
	 public void removeAltComp(@PathVariable int id)
	 {
		manager.delete(id);
	 }
	 @PutMapping(value = "api/altcompoput/{id}")
	 public void updateAltComp(@RequestBody AlternateComponentMaster altcomp,@PathVariable int id)
	 {
		System.out.println("inside updatecomponent of controller");
		manager.update(altcomp,id);
	 }
	 @PostMapping(value ="api/altcomponentpost")
	 public void addAltcomp(@RequestBody AlternateComponentMaster altcomps)
	 {
		System.out.println("addAltComponent called");
		manager.add(altcomps);
	 }
	
	

}
