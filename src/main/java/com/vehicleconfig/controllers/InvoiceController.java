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


import com.vehicleconfig.entities.Invoice;
import com.vehicleconfig.services.InvoiceManager;

@RestController  
@CrossOrigin("http://localhost:3000")
public class InvoiceController 
{
	@Autowired
	InvoiceManager manager;
	
	
	 @GetMapping(value = "api/showinvoices")
	 public List<Invoice> showComponents()
	 {
		  return manager.getAll(); 
		
	 }
	
	 @GetMapping(value = "api/invoicebyId/{id}")
	 public List<?> getComp(@PathVariable int id)
	 {
		List<?> cm=manager.get(id);
		return cm;
	 }
	 
	 @DeleteMapping(value = "api/inv/{id}")
	 public void removeComp(@PathVariable int id)
	 {
		manager.delete(id);
	 }
	 @PutMapping(value = "api/invput/{id}")
	 public void updateComp(@RequestBody Invoice comp,@PathVariable int id)
	 {
		System.out.println("inside updatecomponent of controller");
		manager.update(comp,id);
	 }
	 @PostMapping(value ="api/invpost")
	 public void addSeg(@RequestBody Invoice comps)
	 {
		System.out.println("addComponent called");
		manager.add(comps);
	 }
	
	
	
	

}
