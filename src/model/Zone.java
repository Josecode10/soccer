package model;

import java.util.ArrayList;
import java.util.List;

public class Zone {
    private List<League> leagues = new ArrayList<>();

    public void addLeague(League league) {
        leagues.add(league);
    }

    public void listLeagues() {
        System.out.print("\n--- League list ---\n");

        for(League league: leagues) {
            System.out.println(league.getLeagueName());
            league.listTeams();
        }
    }
}
