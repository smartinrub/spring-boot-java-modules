package com.sergiomartinrubio.team.model;

public class Team {
    private final String name;
    private final String city;

    public Team(String name, String city) {
        this.name = name;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }
}
