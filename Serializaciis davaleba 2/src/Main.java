import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PhoneContact[] contacts = new PhoneContact[30];
        int lastIndex = 0;

        while(true) {
            System.out.println("Which one do you want to do?");
            System.out.println('\t' + "1. Add Contact.");
            System.out.println('\t' + "2. Delete Contact.");
            System.out.println('\t' + "3. Edit Contact.");
            System.out.println('\t' + "4. Exit Program.");
            System.out.print("Your Choice: ");

            int choice = 0;
            try {
                 choice = scanner.nextInt();
            } catch (InputMismatchException ime) {
                System.out.println(ime.getMessage());
                continue;
            }

            if(choice == 1) {
                if (lastIndex > 29) {
                    System.out.println("Contacts are full.");
                    System.out.println("You have to delete something.");
                } else {
                    System.out.println();
                    System.out.println("Adding new Contact.");
                    System.out.print("First Name: ");
                    String firstName = scanner.next();

                    System.out.print("Last Name: ");
                    String lastName = scanner.next();

                    System.out.print("Phone Number: ");
                    String phoneNumber = scanner.next();

                    System.out.print("E-mail: ");
                    String email = scanner.next();

                    contacts[lastIndex] = new PhoneContact(firstName, lastName, phoneNumber, email);
                    lastIndex++;

                    System.out.println("Contact added successfully");
                    System.out.println();
                    new Data().serialize(contacts);
                }
            }

            else if(choice == 2) {
                System.out.println();
                System.out.println("List of Contacts: ");
                for(int i = 0; i < lastIndex; i++) {
                    System.out.println(i+1 + ". " + contacts[i]);
                }

                System.out.print("Which one do you want to remove? (Enter index): ");
                int index = -1;

                try {
                    index = scanner.nextInt();
                } catch (InputMismatchException ime) {
                    System.out.println(ime.getMessage());
                }

                if(index > 0 && index <= lastIndex) {
                    contacts[index-1] = null;
                    new Data().serialize(contacts);
                    System.out.println();
                } else {
                    System.out.println("Index out of bounds.");
                }
            }

            else if(choice == 3) {
                System.out.println();
                System.out.println("List of Contacts: ");
                for(int i = 0; i < lastIndex; i++) {
                    System.out.println(i+1 + ". " + contacts[i]);
                }

                System.out.print("Which one do you want to edit? (Enter index): ");
                int index = -1;

                try {
                    index = scanner.nextInt();
                } catch (InputMismatchException ime) {
                    System.out.println(ime.getMessage());
                }
                if(index >= 0 && index <= lastIndex) {
                    System.out.println();
                    System.out.println("Enter new Contact.");
                    System.out.print("First Name: ");
                    String firstName = scanner.next();

                    System.out.print("Last Name: ");
                    String lastName = scanner.next();

                    System.out.print("Phone Number: ");
                    String phoneNumber = scanner.next();

                    System.out.print("E-mail: ");
                    String email = scanner.next();

                    contacts[index] = new PhoneContact(firstName, lastName, phoneNumber, email);
                    new Data().serialize(contacts);
                } else {
                    System.out.println("Index out of bounds.");
                }
            }

            else if(choice == 4) {
                System.out.println("Good Bye!!!");
                break;
            }

            else {
                System.out.println("You have to enter number between 1-4");
                System.out.println("Try again:");
            }
        }
    }
}