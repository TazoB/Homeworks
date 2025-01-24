import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // davaleba 1
        Writer writer1 = new Writer("Arthur", "Doyle");
        Book book1 = new Book("Sherlock Holmes", 563, "Detective", writer1);

        Writer writer2 = new Writer("Robert", "Stevenson");
        Book book2 = new Book("Treasure Island", 218, "Adventure", writer2);

        Writer writer3 = new Writer("Jules", "Verne");
        Book book3 = new Book("80000 km underwater", 273, "Adventure", writer3);

        Writer writer4 = new Writer("Alexandre", "Dumas");
        Book book4 = new Book("Three Musketeers", 371, "Adventure", writer4);

        List <Book> books = new ArrayList<>();
        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);

        System.out.println(books.get(0));
        System.out.println();

        System.out.println(books.get(1));
        System.out.println();

        System.out.println(books.get(2));
        System.out.println();

        System.out.println(books.get(3));
        System.out.println();


        // davaleba 2
        Fraction fraction1 = new Fraction(4, 5);
        Fraction fraction2 = new Fraction(6, 7);
        Fraction fraction3 = new Fraction(8, 3);
        Fraction fraction4 = new Fraction(4, 5);
        Fraction fraction5 = new Fraction(8, 10);

        List <Fraction> fractions = new ArrayList<>();
        fractions.add(fraction1);
        fractions.add(fraction2);
        fractions.add(fraction3);
        fractions.add(fraction4);
        fractions.add(fraction5);

        System.out.println(fractions.get(0));
        System.out.println(fractions.get(1));
        System.out.println(fractions.get(2));
        System.out.println(fractions.get(3));
        System.out.println(fractions.get(4));
    }
}