package com.xib.assessment.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xib.assessment.DTO.AgentRepository;
import com.xib.assessment.model.Agent;

@Service
public class AgentService {

	@Autowired
	AgentRepository agentRepo;	

    public List<Agent> getAllAgents() {
        List<Agent> agents = new ArrayList<>();
        agentRepo.findAll().forEach(agent -> agents.add(agent));
        return agents;
    }

    public Agent getAgentById(Long id) {
        return agentRepo.findById(id).get();
    }

    public void saveOrUpdate(Agent agent) {
        agentRepo.save(agent);
    }

    }

