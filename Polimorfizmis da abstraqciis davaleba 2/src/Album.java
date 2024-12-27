import java.util.List;

public class Album {
    private String name;
    private int releaseYear;
    private List <Music> musics;

    public Album(String name, int releaseYear, List<Music> musics) {
        this.name = name;
        this.releaseYear = releaseYear;
        this.musics = musics;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public List<Music> getMusics() {
        return musics;
    }

    public void setMusics(List<Music> musics) {
        this.musics = musics;
    }

    public void addMusic(Music music) {
        musics.add(music);
    }

    public void removeMusic(Music music) {
        musics.remove(music);
    }

    public void displayInfo() {
        System.out.println("Name: " + name);

        for (Music music : musics) {
            System.out.println(music);
        }
    }
}
