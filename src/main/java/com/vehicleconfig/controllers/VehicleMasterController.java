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


import com.vehicleconfig.entities.VehicleMaster;
import com.vehicleconfig.services.VehicleMasterManager;

@RestController  
@CrossOrigin("http://localhost:3000")

public class VehicleMasterController 
{
	@Autowired
	VehicleMasterManager manager;
	
	
	 @GetMapping(value = "api/vehicles")
	 public List<VehicleMaster> showVehicles()
	 {
		  return manager.getAll(); 
		
	 }
	
	 @GetMapping(value = "api/vehiclesById/{id}")
	 public List<?> getSeg(@PathVariable int id)
	 {
		List<?> p=manager.get(id);
		return p;
	 }
	 
	 @DeleteMapping(value = "api/vehicle/{id}")
	 public void removeVeh(@PathVariable int id)
	 {
		manager.delete(id);
	 }
	 @PutMapping(value = "api/vehicleput/{id}")
	 public void updateSeg(@RequestBody VehicleMaster vehicle,@PathVariable int id)
	 {
		System.out.println("inside updatevehicle of controller");
		manager.update(vehicle,id);
	 }
	 @PostMapping(value ="api/vehiclepost")
	 public void addSeg(@RequestBody VehicleMaster vehicle)
	 {
		System.out.println("addVehicle called");
		manager.add(vehicle);
	 }
	
	
	

}
