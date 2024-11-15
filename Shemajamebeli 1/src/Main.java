public class Main {
    public static void main(String[] args) {
        // 1) b

        // 2) b

        // 3) d

        // 4) c

        // 5) a

        // 6) c

        // 7) a

        // 8) a

        // 9) a

        // 10) c

        // 11) c

        // 12) c

        // 13) a

        // 14) a

        // 15) b

        // 16)
/*
        int[] books = {1,5,9,2,10,7};
        int maxValue = books[0], minValue = books[0], maxStore = 0, minStore = 0;

        for(int i = 0; i < books.length; i++){
            if(books[i] < minValue){
                minValue =  books[i];
                minStore = i;
            }
            if(books[i] > maxValue) {
                maxValue = books[i];
                maxStore = i;
            }
        }

        System.out.println(minStore + " მაღაზიაში ყველაზე იაფია და ღირს " + minValue + " ლარი.");
        System.out.println(maxStore + " მაღაზიაში ყველაზე ძვირია და ღირს " + maxValue + " ლარი.");

        // 17)

        for(int i = 0; i <= 100; i++){
            if((i % 5 == 0) && (i % 7 != 0)){
                System.out.println("HEY");
            }
            else if((i % 7 == 0) && (i % 5 != 0)){
                System.out.println("HOW");
            } else if((i % 5 == 0) && (i % 7 == 0)){
                System.out.println("HEYHOW");
            }
            else System.out.println(i);
        }

        // 18)

        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        Random random = new Random();

        int arr[][] = new int[x][y];

        for(int i = 0; i < x; i++){
            for(int j = 0; j < y; j++){
                arr[i][j] = random.nextInt(100);
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        int min = arr[0][0];
        int max = arr[0][0];

        int minIndex1 = 0, minIndex2 = 0;
        int maxIndex1 = 0, maxIndex2 = 0;

        for(int i = 0; i < x; i++){
            for(int j = 0; j < y; j++) {
                if(arr[i][j] > max){
                    max = arr[i][j];
                    maxIndex1 = i;
                    maxIndex2 =  j;
                }
                if(arr[i][j] < min){
                    min = arr[i][j];
                    minIndex1 = i;
                    minIndex2 = j;
                }
            }
        }

        System.out.println();
        System.out.println("მასივში უდიდესი რიცხვია " + max + ", მისი ინდექსია (" + maxIndex1 + "; " + maxIndex2 + ").");
        System.out.println("მასივში უმცირესი რიცხვია " + min + ", მისი ინდექსია (" + minIndex1 + "; " + minIndex2 + ").");

        // 19)

        int arr[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        int sum = 0;

        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                if(i == j){
                    sum += arr[i][j];
                }
                if(i == 0 && j == arr[i].length - 1){
                    sum += arr[i][j];
                }
                if(j == 0 && i == arr.length - 1){
                    sum += arr[i][j];
                }
            }
        }

        System.out.println(sum);


        // 20)

       int[][] arr = {
               {1, 2, 3},
               {4, 5, 6},
               {7, 8, 9}
       };

       for(int i = 0; i < arr.length; i++){
           for(int j = i; j < arr[i].length; j++){
               int k = arr[i][j];
               arr[i][j] = arr[j][i];
               arr[j][i] = k;
           }
        }


       for(int i = 0; i < arr.length; i++){
           int start = 0, end = arr.length-1;
           while (start < end) {
               int k = arr[i][start];
               arr[i][start] = arr[i][end];
               arr[i][end] = k;
               start++;
               end--;
           }
       }

       for(int i = 0; i< arr.length; i++){
           for(int j = 0; j < arr[i].length; j++){
               System.out.print(arr[i][j] + " ");
           }
           System.out.println();
       }*/
    }
}