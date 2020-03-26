package com.xib.assessment.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xib.assessment.DTO.TeamRepository;
import com.xib.assessment.model.Team;

@Service
public class TeamService {

	@Autowired
	TeamRepository teamRepo;	

    public List<Team> getAllTeams() {
        List<Team> teams = new ArrayList<>();
        teamRepo.findAll().forEach(team -> teams.add(team));
        return teams;
    }

    public Team getTeamById(Long id) {
        return teamRepo.findById(id).get();
    }

    public void saveOrUpdate(Team team) {
        teamRepo.save(team);
    }

}
