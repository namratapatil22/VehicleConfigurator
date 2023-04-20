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
@Table(name="alternateComponentMaster")
public class AlternateComponentMaster 
{
	private int altId;
	
	private double deltaPrice;
	private Set<Invoice> alternateCompInvoices;
	private int modelId;
	private int compId;
	private int altCompId;
	
	
	
	public AlternateComponentMaster()
	{
		
	}

	public AlternateComponentMaster(double deltaPrice,int compId,int altCompId,int modelId,Set<Invoice> alternateCompInvoices) {
		
		this.deltaPrice = deltaPrice;
		this.alternateCompInvoices= alternateCompInvoices;
		this.compId=compId;
		this.modelId=modelId;
		this.altCompId=altCompId;
	}
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="alt_id")
	public int getAltId() {
		return altId;
	}

	public void setAltId(int altId) {
		this.altId = altId;
	}

	public double getDeltaPrice() {
		return deltaPrice;
	}

	public void setDeltaPrice(double deltaPrice) {
		this.deltaPrice = deltaPrice;
	}
		
	@Column(name="model_id")
	public int getModelId() {
		return modelId;
	}

	public void setModelId(int modelId) {
		this.modelId = modelId;
	}

	@Column(name="comp_id")
	public int getCompId() {
		return compId;
	}

	public void setCompId(int compId) {
		this.compId = compId;
	}

	
	@Column(name="altComp_id")
	public int getAltCompId() {
		return altCompId;
	}

	public void setAltCompId(int altCompId) {
		this.altCompId = altCompId;
	}

	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="alt_id",referencedColumnName="alt_id")
	public Set<Invoice> getAlternateCompInvoices() {
		return alternateCompInvoices;
	}

	public void setAlternateCompInvoices(Set<Invoice> alternateCompInvoices) {
		this.alternateCompInvoices = alternateCompInvoices;
	}

	
	
	
	
	

}
