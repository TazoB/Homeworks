import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // დავალება 1:

        int sum = 0;
        for (int i = 10; i <= 100; i += 5){
            sum += i;
        }
        System.out.println(sum);


        // დავალება 2:

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        int digits = 0;
        for (int i = 0; true; i++){
            digits++;

            if(number / 10 != 0){
                number /= 10;
            }
            else break;
        }
        System.out.println(digits);


        // დავალება 3:

        Scanner S = new Scanner(System.in);
        int num = S.nextInt();

        boolean isPrime = true;
        if(num <= 1){
            isPrime = false;
            System.out.println("არც მარტივია და არც შედგენილია.");
        }
        else {
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            System.out.println(isPrime ? "მარტივი რიცხვია." : "შედგენილი რიცხვია.");
        }

        // დავალება 4:

        Scanner F = new Scanner(System.in);
        int firstNumber = F.nextInt();

        Scanner S = new Scanner(System.in);
        int secondNumber = S.nextInt();

        int max = (firstNumber >= secondNumber) ? firstNumber : secondNumber;
        int usg = 1;

        for (int i = max; i > 0; i--){
            if (firstNumber % i == 0 && secondNumber % i == 0){
                usg = i;
                break;
            }
        }
        System.out.println(usg);

        // დავალება 5:

        for (int i = 100; i <= 999; i++){
            int sumOfDigits = i % 10 + (i / 10) % 10 + (i / 100);
            if (i % sumOfDigits == 0){
                System.out.println(i);
            }
        }

        // დავალება 6:

        int first = 0;
        int second = 1;

        System.out.println("ფიბონაჩის პირველი 10 რიცხვი:");

        for (int i = 0; i < 5; i++){
            System.out.println(first);
            System.out.println(second);

            first += second;
            second += first;

        }
    }
}