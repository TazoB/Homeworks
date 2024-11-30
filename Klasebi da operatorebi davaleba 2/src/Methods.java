public class Methods {
    // 2.
    int sumOfMultiples(int a, int b, int k) {
        if(a > b){
            return 0;
        }
        else {
            if (a % k == 0){
               return a + sumOfMultiples(a+1, b, k);
            }
            else {
                return sumOfMultiples(a+1, b, k);
            }
        }
    }

    // 3.
    int sumOfNumbers(int n) {
        if(n == 1){
            return 1;
        } else {
            return n + sumOfNumbers(n-1);
        }
    }

    // 4.
    int powerOfNumber(int A, int N) {
        if(N < 1){
            return 1;
        } else {
            return A * powerOfNumber(A, N -1);
        }
    }

    // 5.
    int sumOfZeros(int x) {
        if(x < 0){
            x = x*(-1);
        }

        if(x == 0){
            return 1;
        }

        if (x < 10){
            return 0;
        }

        else {
            if (x % 10 == 0){
                return 1 + sumOfZeros(x/10);
            } else {
                return 0 + sumOfZeros(x/10);
            }
        }
    }

    void evenOrOdd(int x) {
        if(sumOfZeros(x) % 2 == 0){
            System.out.println("რიცხვში ნულების რაოდენობა ლუწია.");
        }
        else {
            System.out.println("რიცხვში ნულების რაოდენობა კენტია.");
        }
    }
}
