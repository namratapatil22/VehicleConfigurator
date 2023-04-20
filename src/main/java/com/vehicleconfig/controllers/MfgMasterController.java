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
import com.vehicleconfig.entities.MfgMaster;
import com.vehicleconfig.services.MfgMasterManager;



@RestController  
@CrossOrigin("http://localhost:3000")
public class MfgMasterController 
{
	@Autowired
	MfgMasterManager manager;
	
	
	 @GetMapping(value = "api/manufacurers")
	 public List<MfgMaster> showManufacturers()
	 {
		  return manager.getAll(); 
		
	 }
	
	 @GetMapping(value = "api/mgfById/{id}")
	 public List<MfgMaster> getMfgs(@PathVariable int id)
	 {
		List<MfgMaster> mm=manager.get(id);
		return mm;
	 }
	 
	 @DeleteMapping(value = "api/mfg/{id}")
	 public void removeMfg(@PathVariable int id)
	 {
		manager.delete(id);
	 }
	 @PutMapping(value = "api/mfgput/{id}")
	 public void updatemfg(@RequestBody MfgMaster comp,@PathVariable int id)
	 {
		System.out.println("inside updatemfg of controller");
		manager.update(comp,id);
	 }
	 @PostMapping(value ="api/mfgpost")
	 public void addSeg(@RequestBody MfgMaster mfgs)
	 {
		System.out.println("addManufactures called");
		manager.add(mfgs);
	 }
	
	
	
	
	
	

}
