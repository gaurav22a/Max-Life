package com.ml.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ml.entity.Claims;
import com.ml.entity.Hospitals;
import com.ml.entity.UserEnity;
import com.ml.model.ClaimsDTO;
import com.ml.model.HospitalDTO;
import com.ml.model.UserDTO;
import com.ml.repository.ClaimsRepository;
import com.ml.repository.HospitalRepository;
import com.ml.repository.UserRepository;
import com.ml.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepository userRepo;

	@Autowired
	ClaimsRepository claimsRepo;

	@Autowired
	HospitalRepository hospitalsRepo;

	@Override
	public void createUser(UserDTO userDto) {

		// 2

		System.out.println(userDto);
		UserEnity user = new UserEnity();
		user.setDob(userDto.getDob());
		user.setLastName(userDto.getLastName());
		user.setName(userDto.getName());
		user.setEmailId(userDto.getEmailId());
		user.setSalry(userDto.getSalry());
		user.setUserId(userDto.getUserId());
		user.setPhonNumber(userDto.getPhonNumber());

		userRepo.save(user);

	}

	@Override
	public void createClaims(ClaimsDTO claimsDto) {
		System.out.println(claimsDto);
		Claims claim = new Claims();
		claim.setAmountClaimed(claimsDto.getAmountClaimed());
		claim.setAmountPaid(claimsDto.getAmountPaid());
		claim.setClaimId(claimsDto.getClaimId());
		claim.setClaimStatusCode(claimsDto.getClaimStatusCode());
		claim.setHospitalId(claimsDto.getHospitalId());
		claim.setInsuranceCompanyId(claimsDto.getInsuranceCompanyId());
		claim.setPatientId(claimsDto.getPatientId());
		claim.setUpdatedDate(claimsDto.getUpdatedDate());

		claimsRepo.save(claim);
	}

	public void createHospital(HospitalDTO hospitalDto) {
		System.out.println(hospitalDto);
		Hospitals hospital = new Hospitals();
		hospital.setHospitalId(hospitalDto.getHospitalId());
		hospital.setHospitalName(hospitalDto.getHospitalName());

		hospitalsRepo.save(hospital);

	}

	@Override
	public String getPhoneNumber(String id) {
		// to do

		UserEnity obj = userRepo.findByUserId(id);
		return obj.getPhonNumber();

	}

	@Override
		public Long getClaimStatusCode(Long claimId) {
			//to do
			
			Claims obj2 = claimsRepo.findByClaimId(claimId);	
			return obj2.getClaimStatusCode();
					
		}
	
	@Override
	public String getHospitalName(Long hospitalId) {
		//to do
		
		Hospitals obj3 = hospitalsRepo.findByHospitalId(hospitalId);	
		return obj3.getHospitalName();
				
	}


	@Override
	public List<String> getUsersName() {
		// TODO Auto-generated method stub
		return null;
	}

}
