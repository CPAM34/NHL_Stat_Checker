package com.nhl;

public class League {

    private String name;
    private Team[] teams;

    public League() {
        Team[] teams = new Team[31];

        teams[0] = new Team("Anaheim Ducks", 23);
        teams[1] = new Team("Arizona Coyotes", 29);
        teams[2] = new Team("Boston Bruins", 6);

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Team[] getTeams() {
        return teams;
    }

    public void setTeams(Team[] teams) {
        this.teams = teams;
    }

}
