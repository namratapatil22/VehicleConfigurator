package com.vehicleconfig.repositories;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.vehicleconfig.entities.MfgMaster;



@Repository
@Transactional
public interface MfgMasterRepository extends JpaRepository<MfgMaster,Integer>
{


	@Query("select m from MfgMaster m  where m.segId= :id")	
	List<MfgMaster> findBySeg(@Param("id")int id);

}
