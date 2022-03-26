package com.drvc.microservice.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.drvc.microservice.hrworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long>{

}
