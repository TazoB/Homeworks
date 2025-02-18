import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("First Name: ");
            String firstName = scanner.nextLine();
            System.out.print("Last Name: ");
            String lastName = scanner.nextLine();
            System.out.print("Age: ");
            int age = scanner.nextInt();
            Human human = new Human(firstName, lastName, age);
            human.walk();
            human.hangOut(
                    new Human("Tazo", "Bendianishvili", 15)
            );
        } catch (InputMismatchException ime) {
            System.out.println(ime.getMessage());
        }
    }
}