package com.ml.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ml.entity.Claims;

public interface ClaimsRepository extends JpaRepository<Claims, Long> {
	
	public Claims findByClaimId(Long claimId);

}
