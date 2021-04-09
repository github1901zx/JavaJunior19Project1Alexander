package homework.lesson.lession15;

public class Main {
    public static void main(String[] args) {

        FootballTeam cska = new FootballTeam("CSKA", 11);
        FootballTeam dinamo = new FootballTeam("dinamo", 11);
        FootballTeam spartak = new FootballTeam("spartak", 11);
        FootballTeam lokomotiv = new FootballTeam("lokomotiv", 11);

        Standings standingFifa = new Standings("Fifa");

        standingFifa.addTeam(cska, 2);
        standingFifa.addTeam(dinamo, 7);
        standingFifa.addTeam(lokomotiv, 5);
        standingFifa.addTeam(spartak, 6);

        standingFifa.printAllteams();
        standingFifa.teamsAddPoints(cska);
        standingFifa.printAllteams();
        standingFifa.winner();
        standingFifa.sortStandings();


    }
}
