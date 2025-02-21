import java.io.*;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List <Country> countries = new ArrayList<>();
        try {
            Country country1 = new Country();
            Country country2 = new Country();
            Country country3 = new Country();
            Country country4 = new Country();
            Country country5 = new Country();

            countries.add(country1);
            countries.add(country2);
            countries.add(country3);
            countries.add(country4);
            countries.add(country5);

            for (int i = 0; i < 5; i++) {
                System.out.print("Name: ");
                String name = sc.next();
                countries.get(i).setName(name);

                System.out.print("Population: ");
                int population = sc.nextInt();
                countries.get(i).setPopulation(population);

                System.out.print("Area: ");
                int area = sc.nextInt();
                countries.get(i).setArea(area);
                System.out.println();
            }
        } catch (InputMismatchException ime) {
            System.out.println(ime.getMessage());
        }

        try (ObjectOutputStream oos = new ObjectOutputStream(
                new FileOutputStream("output.txt")
        )) {
            for (Country country : countries) {
                oos.writeObject(country);
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }


        try (ObjectInputStream oip = new ObjectInputStream(
                new FileInputStream("output.txt")
        )) {

            for(int i = 0; i < countries.size(); i++) {
                Country country = (Country) oip.readObject();
                System.out.println(country);
                System.out.println();
            }

        } catch (IOException | ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}