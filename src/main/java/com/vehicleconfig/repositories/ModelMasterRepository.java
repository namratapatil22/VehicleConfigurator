package com.vehicleconfig.repositories;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.vehicleconfig.entities.ModelMaster;
@Repository
@Transactional
public interface ModelMasterRepository  extends JpaRepository<ModelMaster,Integer> 
{
	@Query("select m from ModelMaster m  where m.mfgId= :id")	
	List<ModelMaster> findByManuf(@Param("id")int id);

}
