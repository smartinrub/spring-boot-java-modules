package com.sergiomartinrubio.persistence.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Set;

@Entity
public class Team {
    @Id
    private String name;

    private String city;

    @JsonIgnoreProperties("team") // This is required to avoid an infinite loop
    @OneToMany(mappedBy = "team", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Set<Player> players;

    public Team(String name, String city, Set<Player> players) {
        this.name = name;
        this.city = city;
        this.players = players;
    }

    public Team() {
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public Set<Player> getPlayers() {
        return players;
    }
}
