package com.sergiomartinrubio.player.model;


import com.sergiomartinrubio.team.model.Team;

import java.util.UUID;


public class Player {
    private final UUID id;
    private final String name;
    private final Team team;

    public Player(UUID id, String name, Team team) {
        this.id = id;
        this.name = name;
        this.team = team;
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Team getTeam() {
        return team;
    }
}
