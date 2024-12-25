import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 1.

        Car car1 = new Car("BMW", "M4", 2014, "BE-717-ND");
        Car car2 = new Car("Lamborghini", "Urus", 2017, "TA-777-ZO");

        car1.printInfo();
        car2.printInfo();

        // 2.
        Methods methods = new Methods();
        Scanner scanner = new Scanner(System.in);
        System.out.print("a = ");
        int a = scanner.nextInt();
        System.out.print("b = ");
        int b = scanner.nextInt();
        System.out.print("k = ");
        int k = scanner.nextInt();




        System.out.println(a + "-სა და " + b + "-ს შორის " + k + "-ის ჯერადების ჯამი არის: " + methods.sumOfMultiples(a, b, k));

        // 3.
        int n = scanner.nextInt();
        System.out.println(methods.sumOfNumbers(n));

        //4.
        int A = scanner.nextInt();
        int N = scanner.nextInt();
        System.out.println(methods.powerOfNumber(A, N));

        //5.
        int x = scanner.nextInt();
        methods.evenOrOdd(x);
    }
}