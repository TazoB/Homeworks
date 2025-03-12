package savarjisho3;

import java.util.ArrayList;
import java.util.List;

public class Main3 {
    public static void main(String[] args) {
        ArrayList<Car> cars = new ArrayList<>(
                List.of(
                        new Car("Toyota", "Camry", 2022, 15000, new Engine("Petrol", 4, 2.0)),
                        new Car("Honda", "Civic", 2021, 20000, new Engine("Petrol", 4, 1.8)),
                        new Car("Ford", "Focus", 2020, 25000, new Engine("Diesel", 4, 2.0)),
                        new Car("BMW", "X5", 2019, 30000, new Engine("Petrol", 6, 3.0)),
                        new Car("Mercedes", "C-Class", 2023, 10000, new Engine("Petrol", 4, 2.5)),
                        new Car("Audi", "A4", 2018, 35000, new Engine("Diesel", 4, 2.0))
                )
        );

        System.out.println("ინფორმაცია დაულაგებლად: ");
        cars.forEach(System.out::println);
        System.out.println();

        System.out.println("დალაგებული გამოშვების წელის მიხედვით: ");
        cars.sort(new CompareWithPublishYear());
        cars.forEach(System.out::println);
        System.out.println();

        System.out.println("დალაგებული გარბენის მიხედვით: ");
        cars.sort(new CompareWithCarMileage());
        cars.forEach(System.out::println);
        System.out.println();

        System.out.println("დალაგებული ძრავის მოცულობის მიხედვით: ");
        cars.sort(new CompareWithEngineCapacity());
        cars.forEach(System.out::println);
        System.out.println();
    }
}
