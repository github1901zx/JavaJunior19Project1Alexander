package homework.lesson.lession15;

import java.util.HashMap;
import java.util.Map;

public class Standings {

    private String nameStandings;
    private HashMap<FootballTeam, Integer> teams = new HashMap<>();

    public Standings() {
        //
    }

    public Standings(String nameStandings) {
        this.nameStandings = nameStandings;
    }

    public void addTeam(FootballTeam footballTeam, int countNumbers) {
        teams.put(footballTeam, countNumbers);
    }

    public void printAllteams() {
        for (FootballTeam team : teams.keySet()) {
            System.out.println(team.getNameTeam() + "-" + teams.get(team));
        }
    }

    public void teamsAddPoints(FootballTeam teamName) {
        teams.replace(teamName, teams.get(teamName).intValue()+1);
    }

    public String getNameStandings() {
        return nameStandings;
    }

    public void setNameStandings(String nameStandings) {
        this.nameStandings = nameStandings;
    }

    public void winner() {
        String nameWinner = "";
        int valueWinner = 0;
        for (FootballTeam team : teams.keySet()) {
            if (valueWinner < teams.get(team)) {
                valueWinner = teams.get(team);
                nameWinner = team.getNameTeam();
            }
        }
        System.out.println("Winner " + nameWinner + " Points " + valueWinner);

    }

    public void sortStandings() {

        teams.entrySet().stream().sorted(Map.Entry.<FootballTeam, Integer>comparingByValue().reversed()).
                forEach(System.out::println);

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Standings standings = (Standings) o;

        if (nameStandings != null ? !nameStandings.equals(standings.nameStandings) : standings.nameStandings != null)
            return false;
        return teams != null ? teams.equals(standings.teams) : standings.teams == null;
    }

    @Override
    public int hashCode() {
        int result = nameStandings != null ? nameStandings.hashCode() : 0;
        result = 31 * result + (teams != null ? teams.hashCode() : 0);
        return result;
    }
}
