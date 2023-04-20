package com.vehicleconfig.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="vehicleMaster")
public class VehicleMaster
{
	private int configId;
	private String compType;
	private String isConfigurable;
	private int compId;
	private int modelId;
	
	public VehicleMaster()
	{
		
	}

	public VehicleMaster(String compType,int modelId,int compId ,String isConfigurable) {
	
		this.compType = compType;
		this.isConfigurable = isConfigurable;
		this.compId=compId;
		this.modelId=modelId;
	}

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="config_id")
	public int getConfigId() {
		return configId;
	}

	public void setConfigId(int configId) {
		this.configId = configId;
	}

	public String getCompType() {
		return compType;
	}

	public void setCompType(String compType) {
		this.compType = compType;
	}

	public String getIsConfigurable() {
		return isConfigurable;
	}

	public void setIsConfigurable(String isConfigurable) {
		this.isConfigurable = isConfigurable;
	}
	
	
	
	
	

}
