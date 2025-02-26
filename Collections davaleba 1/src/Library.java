import java.util.ArrayList;
import java.util.Scanner;

public class Library {
    private ArrayList<Book> books = new ArrayList<>();

    public ArrayList<Book> getBooks() {
        return books;
    }

    public void setBooks(ArrayList<Book> books) {
        this.books = books;
    }

    public void populateList() {
        try {
            Scanner scanner = new Scanner("src/input.txt");
            this.books.add(new Book(scanner.next(), scanner.nextInt()));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
