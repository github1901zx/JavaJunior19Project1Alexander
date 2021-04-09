package homework.lesson.lession15;

public class FootballTeam {

    private String nameTeam;
    private int countPlayer;

    public FootballTeam() {
        //
    }

    public FootballTeam(String nameTeam, int countPlayer) {
        this.nameTeam = nameTeam;
        this.countPlayer = countPlayer;
    }

    public String getNameTeam() {
        return nameTeam;
    }

    public void setNameTeam(String nameTeam) {
        this.nameTeam = nameTeam;
    }

    public int getCountPlayer() {
        return countPlayer;
    }

    public void setCountPlayer(int countPlayer) {
        this.countPlayer = countPlayer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        FootballTeam that = (FootballTeam) o;

        if (countPlayer != that.countPlayer) return false;
        return nameTeam != null ? nameTeam.equals(that.nameTeam) : that.nameTeam == null;
    }

    @Override
    public int hashCode() {
        int result = nameTeam != null ? nameTeam.hashCode() : 0;
        result = 31 * result + countPlayer;
        return result;
    }

    @Override
    public String toString() {
        return nameTeam;
    }
}
