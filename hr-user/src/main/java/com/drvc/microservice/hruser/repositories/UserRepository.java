package com.drvc.microservice.hruser.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.drvc.microservice.hruser.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	User findByEmail(String email);
}
