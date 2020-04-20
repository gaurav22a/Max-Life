package com.ml.model;

import java.sql.Date;

public class ClaimsDTO {
	
	private Long claimId;
	private Long claimStatusCode;
	private String hospitalId;
	private String insuranceCompanyId;
	private String patientId ;
	private Date updatedDate;
	private Long amountClaimed;
	private Long amountPaid;
	
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
