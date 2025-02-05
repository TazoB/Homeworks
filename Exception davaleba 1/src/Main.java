import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 1
        Scanner scanner = new Scanner(System.in);
        int a = 1;
        int b = 1;

        try {
            System.out.print("Enter first integer: ");
            a = scanner.nextInt();
            System.out.print("Enter second integer: ");
            b = scanner.nextInt();
        } catch (InputMismatchException ime) {
            System.err.println(ime.getMessage());
        }

        try {
            System.out.println(a + " / " + b + " = " + a/b);
        } catch (ArithmeticException ae) {
            System.err.println(ae.getMessage());
        }


        // 2
        int n = 1;
        try {
            n = scanner.nextInt();
        } catch (InputMismatchException ime) {
            System.err.println(ime.getMessage());
        }

        String str = String.valueOf(n);
        n = Integer.parseInt(str);

        try {
            System.out.println(100 / n);
        } catch (ArithmeticException ae) {
            System.err.println(ae.getMessage());
        }


        // 3.
        int n = 1;
        try {
            n = scanner.nextInt();
        } catch (InputMismatchException ime) {
            System.err.println(ime.getMessage());
        }

        try {
            checkingNumber(n);
        } catch (NegativeNumberException nne) {
            System.err.println(nne.getMessage());
        }


        // 4.
        double n = 1;
        try {
            n = scanner.nextDouble();
        } catch (InputMismatchException ime) {
            System.err.println(ime.getMessage());
        }

        try {
            System.out.println(squareRoot(n));
        } catch (IllegalArgumentException nne) {
            System.err.println(nne.getMessage());
        }
    }


    public static void checkingNumber(int n) throws NegativeNumberException{
        if(n < 0) {
            throw new NegativeNumberException("Provided number is negative.");
        }
    }

    public static double squareRoot(double n) throws IllegalArgumentException{
        if(n < 0) {
            throw new IllegalArgumentException("Provided number is negative.");
        }
        return Math.sqrt(n);
    }
}