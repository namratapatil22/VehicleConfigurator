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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vehicleconfig.entities.SegmentMaster;
import com.vehicleconfig.services.SegmentMasterManager;

@RestController  
@CrossOrigin("http://localhost:3000")

public class SegmentMasterController 
{	
	@Autowired
	SegmentMasterManager manager;
	
	
	 @GetMapping(value = "api/segments")
	 public List<SegmentMaster> showSegments()
	 {
		 System.out.println("segment controller");
		  return manager.getAll(); 
		
	 }
	
	 @GetMapping(value = "api/segmentsById/{segid}")
	 public Optional<SegmentMaster> getSeg(@PathVariable int id)
	 {
		Optional<SegmentMaster> p=manager.get(id);
		return p;
	 }
	 
	 @DeleteMapping(value = "api/segement/{segid}")
	 public void removeSeg(@PathVariable int segid)
	 {
		manager.delete(segid);
	 }
	 @PutMapping(value = "api/segmentput/{segid}")
	 public void updateSeg(@RequestBody SegmentMaster segment,@PathVariable int id)
	 {
		System.out.println("inside updatepro of controller");
		manager.update(segment,id);
	 }
	 @PostMapping(value ="api/segmentspost")
	 public void addSeg(@RequestBody SegmentMaster segment)
	 {
		System.out.println("addpro called");
		manager.add(segment);
	 }
	
	

}
