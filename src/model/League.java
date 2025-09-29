package model;

import java.util.ArrayList;
import java.util.List;

public class League {
    // Attribute
    private static int leagueCounter;
    private int leagueId;
    private String leagueName;
    private List<Team> teams;

    // Constructor
    public League(String leagueName) {
        this.teams = new ArrayList<>();
        this.leagueId = ++leagueCounter;
    }

    // Methods

    public int getLeagueId() {
        return leagueId;
    }

    public String getLeagueName() {
        return leagueName;
    }

    public void setLeagueName(String leagueName) {
        this.leagueName = leagueName;
    }


    public void addTeam(Team team) {
        team.setLeagueId(this.leagueId);
        teams.add(team);
    }

    public void listTeams() {
        System.out.println("\n--- Team List ---");
        var i = 0;
        for(Team team: teams) {
            System.out.println("\n" + team + "\n");
            team.listPlayers();
        }
    }

}
