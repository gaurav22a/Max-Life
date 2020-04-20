package com.ml.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ml.entity.UserEnity;

public interface UserRepository extends JpaRepository<UserEnity, Long> {
	
	public UserEnity findByUserId(String id);

}
