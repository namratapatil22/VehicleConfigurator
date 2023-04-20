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
@Table(name="componentMaster")
public class ComponentMaster
{
	
	private int compId;
	private String compName;
	
	private Set<VehicleMaster> componentVehicles;
	private Set<AlternateComponentMaster> componentAlternateComponents;
	private Set<AlternateComponentMaster> componentAlternateComponents2;
	private Set<Invoice> componentInvoice;
	
	public ComponentMaster() 
	{
		
	}
	

	

	public ComponentMaster(String compName, Set<VehicleMaster> componentVehicles,
			Set<AlternateComponentMaster> componentAlternateComponents,
			Set<AlternateComponentMaster> componentAlternateComponents2, Set<Invoice> componentInvoice) {
		super();
		this.compName = compName;
		this.componentVehicles = componentVehicles;
		this.componentAlternateComponents = componentAlternateComponents;
		this.componentAlternateComponents2 = componentAlternateComponents2;
		this. componentInvoice = componentInvoice;
	}




	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="comp_id")
	public int getCompId() {
		return compId;
	}


	public void setCompId(int compId) {
		this.compId = compId;
	}

	@Column(name="compName")
	public String getCompName() {
		return compName;
	}


	public void setCompName(String compName) {
		this.compName = compName;
	}

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "comp_id", referencedColumnName="comp_id")
	public Set<VehicleMaster> getComponentVehicles() {
		return componentVehicles;
	}


	public void setComponentVehicles(Set<VehicleMaster> componentVehicles) {
		this.componentVehicles = componentVehicles;
	}


	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name= "comp_id",referencedColumnName="comp_id")
	
	public Set<AlternateComponentMaster> getComponentAlternateComponents() {
		return componentAlternateComponents;
	}


	public void setComponentAlternateComponents(Set<AlternateComponentMaster> componentAlternateComponents) {
		this.componentAlternateComponents = componentAlternateComponents;
	}
	
	
	

	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name= "altComp_id",referencedColumnName="comp_id")
	
	public Set<AlternateComponentMaster> getComponentAlternateComponents2() {
		return componentAlternateComponents;
	}


	public void setComponentAlternateComponents2(Set<AlternateComponentMaster> componentAlternateComponents) {
		this.componentAlternateComponents = componentAlternateComponents;
	}
	
	
	

	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="comp_id",referencedColumnName="comp_id")
	public Set<Invoice> getComponentInvoice() {
		return  componentInvoice;
	}

	
	public void setComponentInvoice(Set<Invoice> componentInvoice) {
		this. componentInvoice =  componentInvoice;
	}
	
	
	
	
	
	
	

}
