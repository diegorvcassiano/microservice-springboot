package com.drvc.microservice.hroauth.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.drvc.microservice.hroauth.entities.User;
import com.drvc.microservice.hroauth.feignclients.UserFeignClient;

@Service
public class UserService {
	
	Logger logger = LoggerFactory.getLogger(UserService.class);

	@Autowired
	private UserFeignClient userFeignClient;

	public User findByEmail(String email) {
		User user = userFeignClient.findByEmail(email).getBody();

		if (user == null) {
			logger.error("Email %s not found!", email);
			throw new IllegalArgumentException("Email not found!");
		}
		
		logger.info("Email %s found", email);
		
		return user;
	}
}
