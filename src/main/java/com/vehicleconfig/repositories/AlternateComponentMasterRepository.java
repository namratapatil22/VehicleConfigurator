package com.vehicleconfig.repositories;

import java.util.List;
import java.util.Map;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.vehicleconfig.entities.AlternateComponentMaster;
@Repository
@Transactional
public interface AlternateComponentMasterRepository extends JpaRepository<AlternateComponentMaster,Integer>
{
	@Query(nativeQuery=true,value="select distinct cm.comp_name compName,vm.is_configurable isConfigurable , vm.comp_type compType,acm.model_id modelId,acm.alt_id altId,acm.alt_comp_id altCompId,acm.delta_price deltaPrice,acm.comp_id compId from component_master cm join alternate_component_master acm on  cm.comp_id= acm.alt_comp_id join vehicle_master vm on vm.comp_id= acm.comp_id where acm.model_id=:id") 
	List<Map<String,Object>> findAltById(@Param("id")int id);

}




