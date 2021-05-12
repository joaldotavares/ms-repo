package com.joaldo.worker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.joaldo.worker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long>{

}
