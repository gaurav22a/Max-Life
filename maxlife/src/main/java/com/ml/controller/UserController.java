package com.ml.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ml.model.ClaimsDTO;
import com.ml.model.HospitalDTO;
import com.ml.model.UserDTO;
import com.ml.service.impl.UserServiceImpl;

@RestController
@RequestMapping("/maxlife")
public class UserController {
	
	@Autowired
	UserServiceImpl userserive;
	
	@PostMapping("/user")
	public String saveuserData(@RequestBody UserDTO userDto) {
		//1
		userserive.createUser(userDto);
		return "user inserted !";
	}
	
	
	@GetMapping("/phn/{userId}")
	
	public String fetchData(@PathVariable(name="userId") String userId) {
		//1
		return  userserive.getPhoneNumber(userId);
		
	}
	
	@PostMapping("/hospitals")
	public String saveuserData(@RequestBody HospitalDTO hospitalDto) {
		//1
		userserive.createHospital(hospitalDto);
		return "hospitals inserted !";
	}
	
	@PostMapping("/claims")
	public String saveuserData(@RequestBody ClaimsDTO claimsDto) {
		//1
		userserive.createClaims(claimsDto);
		return "claimss inserted !";
	}
	
	@GetMapping("/code/{claimId}")
	
	public Long fetchClaimData(@PathVariable(name="claimId") Long claimId) {
		//1
		return  userserive.getClaimStatusCode(claimId);
		
	}
	@GetMapping("/name/{hospitalId}")
	
	public String fetchHospitalData(@PathVariable(name="hospitalId") Long hospitalId) {
		//1
		return  userserive.getHospitalName(hospitalId);
		
	}



}
