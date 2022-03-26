package com.drvc.microservice.hrpayroll.services;

import org.springframework.stereotype.Service;

import com.drvc.microservice.hrpayroll.entities.Payment;

@Service
public class PaymentService {
	
	public Payment getPayment(Long workerId, int days) {
		return new Payment("Bob", 100.0, days);
	}
}
