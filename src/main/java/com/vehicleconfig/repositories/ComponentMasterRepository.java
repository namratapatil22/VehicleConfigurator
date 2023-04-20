package com.vehicleconfig.repositories;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.vehicleconfig.entities.ComponentMaster;



@Repository
@Transactional
public interface ComponentMasterRepository  extends JpaRepository<ComponentMaster,Integer> 
{
	
	@Modifying
	@Query("update ComponentMaster c set c.compName = :name where c.compId = :id")
	public void update
	(
			@Param("name") String compName,
			@Param("id")int id);                        
}

