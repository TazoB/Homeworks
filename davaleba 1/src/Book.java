import java.util.Objects;

public class Book {
    private String title;
    private int numberOfPages;
    private String genre;
    private Writer author;

    public Book(String title, int numberOfPages, String genre, Writer author) {
        this.title = title;
        this.numberOfPages = numberOfPages;
        this.genre = genre;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Writer getAuthor() {
        return author;
    }

    public void setAuthor(Writer author) {
        this.author = author;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        if(this.hashCode() != o.hashCode()) return false;
        return numberOfPages == book.numberOfPages && Objects.equals(title, book.title) && Objects.equals(genre, book.genre) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, numberOfPages, genre, author);
    }

    @Override
    public String toString() {
        return "Book {\n" +
                "\tTitle: " + title + ",\n" +
                "\tNumber of pages: " + numberOfPages + ",\n" +
                "\tGenre: '" + genre + ",\n" +
                "\tAuthor: " + author.toString() + ";\n" +
                '}';
    }
}
