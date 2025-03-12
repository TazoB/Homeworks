package savarjisho1;

public class Basketball_Player implements Comparable<Basketball_Player>{
    private String firstName;
    private String lastName;
    private int points;
    private int rebounds;
    private int blocks;
    private int assists;
    private int turnovers;

    public Basketball_Player(String firstName, String lastName, int points, int rebounds, int blocks, int assists, int turnovers) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.points = points;
        this.rebounds = rebounds;
        this.blocks = blocks;
        this.assists = assists;
        this.turnovers = turnovers;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public int getRebounds() {
        return rebounds;
    }

    public void setRebounds(int rebounds) {
        this.rebounds = rebounds;
    }

    public int getBlocks() {
        return blocks;
    }

    public void setBlocks(int blocks) {
        this.blocks = blocks;
    }

    public int getAssists() {
        return assists;
    }

    public void setAssists(int assists) {
        this.assists = assists;
    }

    public int getTurnovers() {
        return turnovers;
    }

    public void setTurnovers(int turnovers) {
        this.turnovers = turnovers;
    }

    public double rating() {
        return this.points + this.rebounds + this.assists * 1.5 + this.blocks * 2 + this.turnovers * (-2);
    }

    @Override
    public int compareTo(Basketball_Player o) {
        return Double.compare(this.rating(), o.rating());
    }

    @Override
    public String toString() {
        return "savarjisho1.Basketball_Player{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", points=" + points +
                ", rebounds=" + rebounds +
                ", blocks=" + blocks +
                ", assists=" + assists +
                ", turnovers=" + turnovers +
                ", rating=" + rating() +
                '}';
    }
}
