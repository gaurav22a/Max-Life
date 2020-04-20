package com.ml.service;

import java.util.List;

import com.ml.entity.UserEnity;
import com.ml.model.ClaimsDTO;
import com.ml.model.HospitalDTO;
import com.ml.model.UserDTO;

public interface UserService {
	
	
	
	public void createUser(UserDTO userDto);
	public void createHospital(HospitalDTO hospitalDto);
	public void createClaims(ClaimsDTO ClaimsDto);
	
	public String getPhoneNumber(String userId);
	public Long getClaimStatusCode(Long claimId);
	public String getHospitalName(Long hospitalId);

	public List<String> getUsersName();

}
