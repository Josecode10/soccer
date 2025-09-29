package model;

import java.util.ArrayList;
import java.util.List;

public class Team {
    // Attributes
    static private int teamCounter;
    private int teamId;
    private String teamName;
    private int leagueId;
    private List<Player> players;

    // Constructor
    public Team(String teamName) {
        this.teamName = teamName;
        this.players = new ArrayList<>();
        this.teamId = ++teamCounter;
    }

    // Methods

    public void addPlayer(Player player) {
        player.setTeamId(this.teamId);
        players.add(player);
        // System.out.println("\nThe player has been added to the team: " + player + "\n");
    }

    public int getTeamId() {
        return teamId;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public int getLeagueId() {
        return leagueId;
    }

    public void setLeagueId(int leagueId) {
        this.leagueId = leagueId;
    }

    public void listPlayers() {
        System.out.print("--- Player list ---\n");
        var i = 0;
        for(Player player: players) {
            System.out.println(++i + ") " + player);
        }
    }

    @Override
    public String toString() {
        return "Team [teamId=" + teamId + ", teamName=" + teamName + ", leagueId=" + leagueId + "]";
    }

}
