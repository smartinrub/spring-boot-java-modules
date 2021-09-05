package com.sergiomartinrubio.model.service;

import com.sergiomartinrubio.persistence.entity.Team;
import com.sergiomartinrubio.persistence.repository.TeamRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class TeamService {

    private final TeamRepository teamRepository;


    public TeamService(TeamRepository teamRepository) {
        this.teamRepository = teamRepository;
    }

    public Team getTeam(String name) {
        Optional<Team> team = teamRepository.findById(name);
        if (team.isPresent()) {
            return team.get();
        }

        throw new RuntimeException("Team not found.");
    }
}
