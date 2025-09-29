package view;

import model.League;
import model.Player;
import model.Team;
import model.Zone;

public class SoccerTeamApp {
    public static void main(String[] args) {
        // Create zone
        Zone myZone = new Zone();
        // Create league
        League league1 = new League("La Liga");
        // Add league to the zone
        myZone.addLeague(league1);
        // Create teams
        Team Ateam = new Team("Real Madrid");
        Team Bteam = new Team("FC Barcelona");
        // Add teams to the league
        league1.addTeam(Ateam);
        league1.addTeam(Bteam);

        // Create players for Real Madrid
        // Goalkeepers
        Player player1 = new Player("Thibaut Courtois", "Goalkeeper", 1);
        // Defenders
        Player player2 = new Player("Dani Carvajal", "Right-back", 2);
        Player player3 = new Player("Éder Militão", "Centre-back", 3);
        // Midfielders
        Player player4 = new Player("Jude Bellingham", "Attacking Midfielder", 7);
        Player player5 = new Player("Eduardo Camavinga", "Central Midfielder", 8);
        Player player6 = new Player("Federico Valverde", "Central Midfielder", 15);
        Player player7 = new Player("Arda Güler", "Attacking Midfielder", 20);
        Player player8 = new Player("Dani Ceballos", "Midfielder", 35);
        // Forwards
        Player player9 = new Player("Vinícius Júnior", "Left Winger", 11);
        Player player10 = new Player("Rodrygo", "Right Winger", 10);
        Player player11 = new Player("Kylian Mbappé", "Centre-forward", 9);

        // Add the player to the team
        Ateam.addPlayer(player1);
        Ateam.addPlayer(player2);
        Ateam.addPlayer(player3);
        Ateam.addPlayer(player4);
        Ateam.addPlayer(player5);
        Ateam.addPlayer(player6);
        Ateam.addPlayer(player7);
        Ateam.addPlayer(player8);
        Ateam.addPlayer(player9);
        Ateam.addPlayer(player10);
        Ateam.addPlayer(player11);

        // Create player for FC Barcelona
        Player player12 = new Player("Marc-André ter Stegen", "Goalkeeper", 1);
        Player player13 = new Player("João Cancelo", "Right-back", 2);
        Player player14 = new Player("Ronald Araújo", "Centre-back", 4);
        Player player15 = new Player("Jules Koundé", "Centre-back", 5);
        Player player16 = new Player("Alejandro Balde", "Left-back", 3);
        Player player17 = new Player("Andreas Christensen", "Centre-back", 15);
        Player player18 = new Player("Frenkie de Jong", "Central Midfielder", 21);
        Player player19 = new Player("Pedri", "Attacking Midfielder", 8);
        Player player20 = new Player("Gavi", "Central Midfielder", 6);
        Player player21 = new Player("Ilkay Gündogan", "Central Midfielder", 22);
        Player player22 = new Player("Oriol Romeu", "Defensive Midfielder", 18);
        // Add players to the team
        Bteam.addPlayer(player12);
        Bteam.addPlayer(player13);
        Bteam.addPlayer(player14);
        Bteam.addPlayer(player15);
        Bteam.addPlayer(player16);
        Bteam.addPlayer(player17);
        Bteam.addPlayer(player18);
        Bteam.addPlayer(player19);
        Bteam.addPlayer(player20);
        Bteam.addPlayer(player21);
        Bteam.addPlayer(player22);

        // Call the zone method
        myZone.listLeagues();
    }

}
