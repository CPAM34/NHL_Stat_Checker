package com.nhl;

public class Team {

    private String name;
    private int nhl_com_id;
    private Player[] players;

    public Team(String name, int nhl_com_id) {
        this.name = name;
        this.nhl_com_id = nhl_com_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNhl_com_id() {
        return nhl_com_id;
    }

    public void setNhl_com_id(int nhl_com_id) {
        this.nhl_com_id = nhl_com_id;
    }

    public Player[] getPlayers() {
        return players;
    }

    public void setPlayers(Player[] players) {
        this.players = players;
    }

}
