package com.sergiomartinrubio.persistence.entity;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.util.Objects;
import java.util.UUID;

@Entity
public class Player {

    @Id
    private UUID id;

    private String name;

    @ManyToOne
    @JoinColumn(name = "team_name")
    @JsonIgnoreProperties("players") // This is required to avoid an infinite loop
    private Team team;


    public Player() {
    }

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Player player = (Player) o;
        return Objects.equals(id, player.id);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
