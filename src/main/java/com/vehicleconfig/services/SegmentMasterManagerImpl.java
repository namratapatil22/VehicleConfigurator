package com.vehicleconfig.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vehicleconfig.entities.SegmentMaster;
import com.vehicleconfig.repositories.SegmentMasterRepository;

@Service
public class SegmentMasterManagerImpl implements SegmentMasterManager
{
	@Autowired
	SegmentMasterRepository repository;

	@Override
	public void add(SegmentMaster seg) 
	{
		repository.save(seg);
	}

	@Override
	public List<SegmentMaster> getAll() 
	{
		 System.out.println("segment service");
	
		return repository.findAll();
	}

	@Override
	public void delete(int id)
	{
		
		repository.deleteById(id);
	}

	@Override
	public void update(SegmentMaster segment, int segid)
	{
		
		repository.update(segment.getSegName(), segid);
		
	}

	@Override
	public Optional<SegmentMaster> get(int id)
	{
		
		return repository.findById(id);
	}
	
	
}
