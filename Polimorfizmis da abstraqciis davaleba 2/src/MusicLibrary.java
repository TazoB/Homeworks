import java.util.List;
import java.util.Random;

public class MusicLibrary {
    private List <Artist> artists;
    private List <Album> albums;
    private List <Music> songs;

    public MusicLibrary(List<Album> albums, List<Artist> artists, List<Music> songs) {
        this.albums = albums;
        this.artists = artists;
        this.songs = songs;
    }

    public List<Artist> getArtists() {
        return artists;
    }

    public void setArtists(List<Artist> artists) {
        this.artists = artists;
    }

    public List<Album> getAlbums() {
        return albums;
    }

    public void setAlbums(List<Album> albums) {
        this.albums = albums;
    }

    public List<Music> getSongs() {
        return songs;
    }

    public void setSongs(List<Music> songs) {
        this.songs = songs;
    }

    public void addArtist(Artist artist) {
        artists.add(artist);
    }

    public void removeArtist(Artist artist) {
        artists.remove(artist);
    }

    public void addAlbum(Album album) {
        albums.add(album);
    }

    public void removeArtist(Album album) {
        albums.remove(album);
    }

    public void addMusic(Music music) {
        songs.add(music);
    }

    public void removeMusic(Music music) {
        songs.remove(music);
    }

    public Music searchMusic(String title) {
        for(int i = 0; i < songs.size(); i++) {
            if(songs.get(i).getTitle().equals(title)) {
                return songs.get(i);
            }
        }
        return null;
    }

    public Music  giveRandomMusic() {
        Random random = new Random();
        int i = random.nextInt(songs.size());

        return songs.get(i);
    }
}
