package com.vehicleconfig.repositories;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.vehicleconfig.entities.SegmentMaster;

@Repository
@Transactional
public interface SegmentMasterRepository extends  JpaRepository<SegmentMaster,Integer> 
{
	@Modifying
	@Query("update SegmentMaster s set s.segName = :name where s.segId = :id")
  public void update(@Param("name") String segName,@Param("id")int segId);
	
	

}
