public class Main {
    public static void main(String[] args) {


        LibraryEmployee employee1 = new LibraryEmployee("Tazo", "Bendianishili", "01955003768");
        LibraryEmployee employee2 = new LibraryEmployee("Tekla", "kemularia", "02183924");
        LibraryEmployee employee3 = new LibraryEmployee("Lika", "Tskhelishvili", "29729736");LibraryEmployee employee4 = new LibraryEmployee("Lasha", "Marjanidze", "6541198");

        LibraryEmployee[] employees = new LibraryEmployee[3];
        employees[0] = employee1;
        employees[1] = employee2;
        employees[2] = employee3;

        Book book1 = new Book("Harry Potter", 457, "J.K Rowling", false);
        Book book2 = new Book("Twenty Thousand Leagues Under the Sea", 276, "Jules Verne", false);
        Book book3 = new Book("The picture of Dorian Grey", 97, "Oscar Wilde", true);
        Book book4 = new Book("The Three Musketeers", 620, "Alexandre Dumas", true);

        Book[] books = {
                book1,
                book2,
                book3,
                book4
        };


        Library library = new Library(employees, books, "B.O.O.K.S");

        BookAdvisor otherEmployee = new BookAdvisor("Lasha", "Marjanidze", "6541198", 9.9, library);
        System.out.println(otherEmployee.suggestMeBook());
    }
}