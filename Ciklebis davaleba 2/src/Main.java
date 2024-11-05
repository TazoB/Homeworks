import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // დავალება 1:

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        double sum = 0;
        for (int i = 1; i <= n; i++){
            sum += i;
        }
        sum /= n;

        System.out.println(sum);

        // დავალება 2:

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        if(n >= 0){
            int i = 1;
            while(true){
                if(n == 0) break;
                if(i*2 <= n){
                    i *= 2;
                }
                else{
                    n -= i;
                    System.out.println(i);
                    i = 1;
                }
            }
        }

        // დავალება 3:

        for(int i = 1; i <= 15; i+=2){
            if(i == 5 || i == 7 || i == 11){
                continue;
            }
            System.out.println(i);
        }

        // დავალება 4:

        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int n = 0;

        while(x > 0){
            if(x % 10 == 0){
                n = n * 10 + 2;
            }
            else {
                n = n * 10 + x % 10;
            }
            x /= 10;
        }

        while(n > 0){
            if(n % 10 == 2){
                x = x * 2;
            }
            else if(n % 10 == 1){
                x = x * 2 + 1;
            }
            n /= 10;
        }
        System.out.println(x);

        // დავალება 5:

        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();

        int n = 0;

        while(x > 0){
            if(x % 2 == 0){
                n = n * 10 + 2;
            }else {
                n = n * 10 + 1;
            }
            x /= 2;
        }

        while(n > 0){
            if(n % 10 == 2){
                x = x * 10 + 0;
            }
            else {
                x = x * 10 + n % 10;
            }
            n /= 10;
        }
        System.out.println(x);

        // დავალება 6:

        Random random = new Random();
        int x = random.nextInt(100) + 1;

        int tries = 0;

        Scanner scanner = new Scanner(System.in);

        while(true){
            tries ++;
            System.out.print("შემოიყვანეთ რიცხვი: ");
            int guess = scanner.nextInt();
            if(guess == x){
                System.out.println();
                System.out.println("გამოიცანით! ");
                System.out.println("რიცხვი იყო " + x);
                System.out.println("ამისთვის თქვენ დაგჭირდათ " + tries + " ცდა.");
                break;
            }
            else if(guess < x){
                System.out.println(guess + " ნაკლებია ჩაფიქრებულ რიცხვზე.");
                System.out.println();
            }else {
                System.out.println(guess + " მეტია ჩაფიქრებულ რიცხვზე");
                System.out.println();
            }
        }
    }
}