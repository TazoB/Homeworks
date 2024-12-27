import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Music music1 = new Music("Genre1", 3.54, "Title1");
        Music music2 = new Music("Genre2", 5.00, "Title2");
        Music music3 = new Music("Genre3", 4.00, "Title3");
        Music music4 = new Music("Genre4", 3.00, "Title4");
        Music music5 = new Music("Genre5", 3.54, "Title5");
        Music music6 = new Music("Genre6", 5.00, "Title6");
        Music music7 = new Music("Genre7", 4.00, "Title7");
        Music music8 = new Music("Genre8", 3.00, "Title8");

        List <Music> musicList1 = new ArrayList<>();
        musicList1.add(music1);
        musicList1.add(music2);

        List <Music> musicList2 = new ArrayList<>();
        musicList2.add(music3);
        musicList2.add(music4);

        List <Music> musicList3 = new ArrayList<>();
        musicList2.add(music5);
        musicList2.add(music6);

        List <Music> musicList4 = new ArrayList<>();
        musicList2.add(music7);
        musicList2.add(music8);

        Album album1 = new Album("Name1", 2005, musicList1);
        Album album2 = new Album("Name2", 2007, musicList2);
        Album album3 = new Album("Name3", 2009, musicList3);
        Album album4 = new Album("Name4", 2016, musicList4);

        List <Album> albumList1 = new ArrayList<>();
        albumList1.add(album1);
        albumList1.add(album2);

        List <Album> albumList2 = new ArrayList<>();
        albumList2.add(album3);
        albumList2.add(album4);

        Artist artist1 = new Artist("Name1", albumList1);
        Artist artist2 = new Artist("Name2", albumList2);

        List <Artist> artistList = new ArrayList<>();
        artistList.add(artist1);
        artistList.add(artist2);

        MusicLibrary musicLibrary = new MusicLibrary(albumList1, artistList, musicList1);

        String title = "Title1";
        Music otherMusic =  musicLibrary.searchMusic(title);

        otherMusic.displayInfo();
        otherMusic.play();
        otherMusic.stop();
    }
}