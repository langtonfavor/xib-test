package com.xib.assessment.DTO;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.xib.assessment.model.Agent;

@Repository("agentRepository")
public interface AgentRepository extends JpaRepository<Agent, Long> {
//	public List<Agent> findAll(String agent);
//		   Optional<Agent> findById(Long id);	
}