package savarjisho2;

import java.util.ArrayList;
import java.util.List;

public class Main2 {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>(
                List.of(
                        new Student("Tazo", "Bendianishvili", "26.03.2009", new ArrayList<>(List.of(10,9,2,5,8,2,9,10,10,9,8,7,9,5))),
                        new Student("Lasha", "Tskhelishvili", "04.04.2009", new ArrayList<>(List.of(6,7,8,5,8,9,6,10,10,10,3))),
                        new Student("Tekla", "Bendianishvili", "14.02.2008", new ArrayList<>(List.of(10,10,10,9,8,6,8,8,5,7,5)))
                )
        );

        System.out.println("დაულაგებლად: ");
        students.forEach(System.out::println);
        System.out.println();

        System.out.println("დალაგებული ლექსიკოგრაფიულად: ");
        students.sort(new CompareLexicographically());
        students.forEach(System.out::println);
        System.out.println();

        System.out.println("საშუალო ქულების მიხედვით დალაგებული:");
        students.sort(new CompareWithAverageMark());
        students.forEach(System.out::println);
        System.out.println();

        System.out.println("დაბადების თარიღის მიხედვით დალაგებული");
        students.sort(new CompareWithDate());
        students.forEach(System.out::println);
        System.out.println();
    }
}
