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
@Table(name ="segmentMaster")
public class SegmentMaster 
{
	private int segId;
	private String segName;
	
	
	private Set<MfgMaster> segmentManufactures;
	private Set<ModelMaster> segmentModels;
	
	public SegmentMaster()
	{
		
	}

	public SegmentMaster(String segName, Set<MfgMaster> segmentManufactures,Set<ModelMaster> segmentModels) {
		super();
		this.segName = segName;
		this.segmentManufactures = segmentManufactures;
		this.segmentModels = segmentModels;
	}

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "seg_id")
	
	public int getSegId() {
		return segId;
	}

	public void setSegId(int segId) {
		this.segId = segId;
	}

	
	
	public String getSegName() {
		return segName;
	}

	public void setSegName(String segName) {
		this.segName = segName;
	}
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "seg_id", referencedColumnName="seg_id")

	public Set<MfgMaster> getSegmentManufactures() {
		return segmentManufactures;
	}

	public void setSegmentManufactures(Set<MfgMaster> segmentManufactures) {
		this.segmentManufactures = segmentManufactures;
	}
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "seg_id", referencedColumnName="seg_id")

	public Set<ModelMaster> getSegmentModels() {
		return segmentModels;
	}

	public void setSegmentModels(Set<ModelMaster> segmentModels) {
		this.segmentModels = segmentModels;
	}
	
	
	
	

}
