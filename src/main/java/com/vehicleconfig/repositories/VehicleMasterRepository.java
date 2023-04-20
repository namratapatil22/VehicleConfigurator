package com.vehicleconfig.repositories;

import java.util.List;
import java.util.Map;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.vehicleconfig.entities.VehicleMaster;

@Repository
@Transactional
public interface VehicleMasterRepository extends JpaRepository<VehicleMaster,Integer> 
{
	@Modifying
	@Query("update VehicleMaster v set v.compType=:type, v.isConfigurable=:configg where v.configId=:id")
	 void update
	(
			@Param("type") String compType,
			@Param("configg") String isConfigurable,
			@Param("id")int id);     
	
	
	@Query(nativeQuery=true,value="SELECT v.model_id AS modelId,c.comp_id AS compId,c.comp_name AS compName,v.is_configurable AS isConfigurable,m.image_path AS imagePath,m.model_price AS modelPrice FROM Vehicle_Master v JOIN Component_Master c ON v.comp_id = c.comp_id JOIN Model_Master m ON m.model_id = v.model_id WHERE v.model_id =:id") 
	List<Map<String,Object>> findVehbyId(@Param("id")int id);
}
