package com.ml.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.ml.entity.Hospitals;

public interface HospitalRepository extends JpaRepository<Hospitals , Long >{
	
	public Hospitals findByHospitalId(Long hospitalId);

}
