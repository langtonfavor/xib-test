package com.xib.assessment.crontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.xib.assessment.model.Team;
import com.xib.assessment.service.TeamService;

@RestController
public class TeamController {
	@Autowired
	TeamService teamService;

	@GetMapping("/team")
	private List<Team> getAllTeams() {
		return teamService.getAllTeams();
	}

	@GetMapping("/team/{id}")
	private Team getTeam(@PathVariable("id") long id) {
		return teamService.getTeamById(id);
	}

	@PostMapping("/team")
	private Long saveAgent(@RequestBody Team team) {
		teamService.saveOrUpdate(team);
		return team.getId();
	}
}