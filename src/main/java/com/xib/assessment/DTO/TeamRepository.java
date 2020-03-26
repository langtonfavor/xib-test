package com.xib.assessment.DTO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.xib.assessment.DTO.TeamRepository;
import com.xib.assessment.model.Team;

@Repository("teamRepository")
public interface TeamRepository extends JpaRepository<Team, Long> {
}
