import java.util.List;

public class Artist {
    private String name;
    private List <Album> albums;

    public Artist(String name, List<Album> albums) {
        this.name = name;
        this.albums = albums;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Album> getAlbums() {
        return albums;
    }

    public void setAlbums(List<Album> albums) {
        this.albums = albums;
    }

    public void addAlbum(Album album) {
        albums.add(album);

        for (Music a : album.getMusics()){
            album.addMusic(a);
        }
    }

    public void removeAlbum(Album album) {
        albums.remove(album);
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        for (int i = 0; i < albums.size(); i++) {
            System.out.println("Album Name: " + albums.get(i).getName());
            System.out.println("Musics:");

            for (int j = 0; j < albums.get(i).getMusics().size(); j++) {
                System.out.println(albums.get(i).getMusics().get(j).getTitle());
            }
        }
    }
}
