public class Book {
    private String title;
    private int numberOfPages;
    private String author;
    private boolean isHardcover;

    public Book(String title, int numberOfPages, String author, boolean isHardcover) {
        this.title = title;
        this.numberOfPages = numberOfPages;
        this.author = author;
        this.isHardcover = isHardcover;
    }

    public void reading() {
        System.out.println("I am reading the book called: " + title);
    }

    public String getTitle() {
        return title;
    }
}
