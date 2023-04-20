package com.vehicleconfig.entities;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;



@Entity
@Table(name = "mfgMaster")
public class MfgMaster 
{
	private int mfgId;
	private String mfgName;
	private int segId;
	
	private Set<ModelMaster> mfgModels;
	
	public MfgMaster() 
	{
	
	}

	public MfgMaster(int segId,String mfgName, Set<ModelMaster> mfgModels)
	{
		
		this.mfgName = mfgName;
		this.mfgModels = mfgModels;
		this.segId=segId;
	}

	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "mfg_id")
	
	public int getMfgId() {
		return mfgId;
	}

	public void setMfgId(int mfgId) {
		this.mfgId = mfgId;
	}
	
	
	public String getMfgName() {
		return mfgName;
	}

	public void setMfgName(String mfgName) {
		this.mfgName = mfgName;
	}
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "mfg_id", referencedColumnName="mfg_id")

	public Set<ModelMaster> getMfgModels() {
		return mfgModels;
	}

	public void setMfgModels(Set<ModelMaster> mfgModels) {
		this.mfgModels = mfgModels;
	}

	@Column(name = "seg_id")
	public int getSegId() {
		return segId;
	}

	public void setSegId(int segId) {
		this.segId = segId;
	}
	
	
	
	
	
	
	

}
