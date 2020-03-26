package com.xib.assessment.DTO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.xib.assessment.model.Manager;

@Repository("managerRepository")
public interface ManagerRepository extends JpaRepository<Manager, Long> {
	
}
