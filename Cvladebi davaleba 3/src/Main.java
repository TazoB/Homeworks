public class Main {
    public static void main(String[] args) {
        //დავალება 1:

        double number1 = 5;
        double number2 = 7;
        double number3 = 8;

        double arithmeticMean = (number1 + number2 + number3) / 3;
        System.out.println(arithmeticMean);

        //დავალება 2:

        int number = 5;
        String result = number % 2 == 0 ? "luwi" : "kenti";
        System.out.println(result);

        //დავალება 3:

        double firstNumber = 6;
        double secondNumber = 5;

        String RESULT = (firstNumber > secondNumber) ? "First is greater: " : (secondNumber > firstNumber) ? "Second is greater: " : "First is equal to second: ";
        double max = (firstNumber > secondNumber) ? firstNumber : secondNumber;

        System.out.print(RESULT);
        System.out.println(max);

        //დავალება 4:

        int num = 9999;
        if(num >= 1000 && num <= 9999){
            int N = num;

            int fourth = N % 10;
            N /= 10;

            int third = N % 10;
            N /= 10;

            int second = N % 10;
            N /= 10;

            int first = N;

            int sum = first + second + third + fourth;
            System.out.println("The sum of digits of " + num + " = " + sum);
        }
        else{
            System.out.println("This number is not four digits.");
        }

        //დავალება 5:

        double num1 = 5;
        double num2 = 6;
        double num3 = 9;

        boolean isTrue = false;
        boolean isPositive = false;

        if((num1 + num2) > num3 && (num1 + num3) > num2 && (num2 + num3) > num1){
            isTrue = true;
        }
        if (num1 > 0 && num2 > 0 && num3 > 0){
            isPositive = true;
        }

        if (isTrue && isPositive){
            System.out.println("სამკუთხედის შედგენა შესაძლებელია.");
        }
        else{
            System.out.println("სამკუთხედის შედგენა შეუძლებელია.");
        }
    }
}