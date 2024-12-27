import java.util.List;

public class Music extends Playable{
    private String title;
    private double duration;
    private String genre;

    public Music(String genre, double duration, String title) {
        this.genre = genre;
        this.duration = duration;
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public void play() {
        System.out.println("*Music plays*");
    }

    @Override
    public void stop() {
        System.out.println("*Music stops*");
    }

    public void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Duration: " + duration);
        System.out.println("Genre: " + genre);
    }
}
