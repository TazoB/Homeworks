public class Library {
    private String name;
    private LibraryEmployee[] employees;
    private Book[] books;

    public Library(LibraryEmployee[] employees, Book[] books, String name) {
        this.name = name;
        this.employees = employees;
        this.books = books;

    }

    public Book[] getBooks() {
        return books;
    }
}
