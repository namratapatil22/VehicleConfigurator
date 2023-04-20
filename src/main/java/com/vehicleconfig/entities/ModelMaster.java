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
@Table(name="modelMaster")
public class ModelMaster 
{
	private int modelId;
	private String modelName;
	private int minQty;	
	private double modelPrice;
	private String imagePath;
	private int mfgId;
	private int segId;
	
	private Set<Invoice> modelInvoices;
	private Set<AlternateComponentMaster> alternatescomp;
	private Set<VehicleMaster> vehiclemasters;
	
	public ModelMaster()
	{
		
	}

	public ModelMaster(int modelId,int mfgId,int segId, String modelName, int minQty, double modelPrice, String imagePath,Set<Invoice> modelInvoices,
			Set<AlternateComponentMaster> alternatescomp,Set<VehicleMaster> vehiclemasters)
	{
	
		this.modelId = modelId;
		this.modelName = modelName;
		this.minQty = minQty;
		this.modelPrice = modelPrice;
		this.imagePath = imagePath;
		this.modelInvoices=modelInvoices;
		this.alternatescomp= alternatescomp;
		this.vehiclemasters=vehiclemasters;
		this.mfgId=mfgId;
		this.segId=segId;
	}
	
	
	
   @Id
   @GeneratedValue(strategy=GenerationType.IDENTITY)
   @Column(name="model_id")
	public int getModelId() {
		return modelId;
	}

	public void setModelId(int modelId) {
		this.modelId = modelId;
	}

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public int getMinQty() {
		return minQty;
	}

	public void setMinQty(int minQty) {
		this.minQty = minQty;
	}

	public double getModelPrice() {
		return modelPrice;
	}

	
	@Column(name="mfg_id")
	public int getMfgId() {
		return mfgId;
	}

	public void setMfgId(int mfgId) {
		this.mfgId = mfgId;
	}
	
	
	@Column(name="seg_id")
	public int getSegId() {
		return segId;
	}

	public void setSegId(int segId) {
		this.segId = segId;
	}

	public void setModelPrice(double modelPrice) {
		this.modelPrice = modelPrice;
	}

	public String getImagePath() {
		return imagePath;
	}

	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}

	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="model_id",referencedColumnName="model_id")
	public Set<Invoice> getModelInvoices() {
		return modelInvoices;
	}

	public void setModelInvoices(Set<Invoice> modelInvoices) {
		this.modelInvoices = modelInvoices;
	}

	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="model_id",referencedColumnName="model_id")
	public Set<AlternateComponentMaster> getAlternatescomp() {
		return alternatescomp;
	}

	public void setAlternatescomp(Set<AlternateComponentMaster> alternatescomp) {
		this.alternatescomp = alternatescomp;
	}

	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="model_id",referencedColumnName="model_id")
	public Set<VehicleMaster> getVehiclemasters() {
		return vehiclemasters;
	}
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="model_id",referencedColumnName="model_id")
	public void setVehiclemasters(Set<VehicleMaster> vehiclemasters) {
		this.vehiclemasters = vehiclemasters;
	}
	
	
	
	
}
