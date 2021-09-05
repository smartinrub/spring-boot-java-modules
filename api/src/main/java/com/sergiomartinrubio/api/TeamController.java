package com.sergiomartinrubio.api;

import com.sergiomartinrubio.model.service.TeamService;
import com.sergiomartinrubio.persistence.entity.Team;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/team")
public class TeamController {

    private final TeamService teamService;

    public TeamController(TeamService teamService) {
        this.teamService = teamService;
    }

    @GetMapping("/{name}")
    public Team getPlayer(@PathVariable("name") String name) {
        return teamService.getTeam(name);
    }
}
