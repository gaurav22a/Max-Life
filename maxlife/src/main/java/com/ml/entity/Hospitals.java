package com.ml.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name= "hospitals")
public class Hospitals {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private Long hospitalId;
	private String hospitalName;
	
	
	/* @OneToOne(mappedBy = "hospitals", cascade = CascadeType.ALL)
	    private Claims claims;*/
	 
	public Long getHospitalId() {
		return hospitalId;
	}
	public void setHospitalId(Long hospitalId) {
		this.hospitalId = hospitalId;
	}
	public String getHospitalName() {
		return hospitalName;
	}
	public void setHospitalName(String hospitalName) {
		this.hospitalName = hospitalName;
	}

	
	

}
