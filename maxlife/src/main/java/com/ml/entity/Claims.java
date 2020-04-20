package com.ml.entity;

import java.sql.Date;

import javax.annotation.Generated;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name= "claims")
public class Claims {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long claimId;
	private Long claimStatusCode;
	private String hospitalId;
	private String insuranceCompanyId;
	private String patientId;
	private Date updatedDate;
	private Long amountClaimed;
	private Long amountPaid;

   /*
    
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "claimStatusCode", referencedColumnName = "claimStatusCode")
	private RefClaimsStatus refClaimsStatus;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "hospitalId", referencedColumnName = "hospitalId")
	private Hospitals hospitals;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "insuranceCompanyId", referencedColumnName = "insuranceCompanyId")
	private InsuranceCompanies insuranceCompanies;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "patientId", referencedColumnName = "patientId")
	private Patients patients;
	*/

	public Long getClaimId() {
		return claimId;
	}

	public void setClaimId(Long claimId) {
		this.claimId = claimId;
	}

	public Long getClaimStatusCode() {
		return claimStatusCode;
	}

	public void setClaimStatusCode(Long claimStatusCode) {
		this.claimStatusCode = claimStatusCode;
	}

	public String getHospitalId() {
		return hospitalId;
	}

	public void setHospitalId(String hospitalId) {
		this.hospitalId = hospitalId;
	}

	public String getInsuranceCompanyId() {
		return insuranceCompanyId;
	}

	public void setInsuranceCompanyId(String insuranceCompanyId) {
		this.insuranceCompanyId = insuranceCompanyId;
	}

	public String getPatientId() {
		return patientId;
	}

	public void setPatientId(String patientId) {
		this.patientId = patientId;
	}

	public Date getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}

	public Long getAmountClaimed() {
		return amountClaimed;
	}

	public void setAmountClaimed(Long amountClaimed) {
		this.amountClaimed = amountClaimed;
	}

	public Long getAmountPaid() {
		return amountPaid;
	}

	public void setAmountPaid(Long amountPaid) {
		this.amountPaid = amountPaid;
	}

	

}
