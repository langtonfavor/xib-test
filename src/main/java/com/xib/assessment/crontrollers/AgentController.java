package com.xib.assessment.crontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.xib.assessment.model.Agent;
import com.xib.assessment.service.AgentService;

@RestController
public class AgentController {
	@Autowired
    AgentService agentService;

    @GetMapping("/agents")
    private List<Agent> getAllAgents() {
        return agentService.getAllAgents();
    }

    @GetMapping("/agent/{id}")
    private Agent getAgent(@PathVariable("id") long id) {
        return agentService.getAgentById(id);
    }   

    @PostMapping("/agents")
    private Long saveAgent(@RequestBody Agent agent) {
        agentService.saveOrUpdate(agent);
        return agent.getId();
    }
}
