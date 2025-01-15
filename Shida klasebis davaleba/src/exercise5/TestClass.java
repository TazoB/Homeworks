package exercise5;

public class TestClass {
    public static void main(String[] args) {
        Library library = new Library("9978723", "Library");
        Library.Book book = library.new Book("9263221", "Harry Potter and chamber of secrets");

        library.printInfo();
        book.printInfo();
    }
}
