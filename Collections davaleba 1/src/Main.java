import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // 1.
        ArrayList<Integer> integers = new ArrayList<>();
        int i = 0;
        do {
            Random rand = new Random();
            i = rand.nextInt(50);
            integers.add(i);
        } while (i != 40);

        System.out.println("Size: " + integers.size());
        for (Integer a : integers) {
            System.out.print(a + ", ");
        }

        ArrayList<Integer> result = new ArrayList<>();

        for(Integer a : integers) {
            if(a % 2 == 1) result.add(a);
        }
        System.out.println();
        System.out.println();
        System.out.println("Odd Numbers: ");
        for (Integer a : result) {
            System.out.print(a + ", ");
        }


        // 2.
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(4);
        list.add(2);
        list.add(4);
        list.add(12);
        list.add(19);
        print(list);

        // 3.
        int[] array = new int[5];
        for (int i = 0; i < 5; i++) {
            Random rand = new Random();
            array[i] = rand.nextInt(50);
        }

        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            arrayList.add(array[i]);
        }
        int max = arrayList.getFirst();
        int maxIndex = 0;
        for(int i = 1; i < arrayList.size(); i++) {
            if(arrayList.get(i) > max) {
                max = arrayList.get(i);
                maxIndex = i;
            }
        }
        System.out.println("Index of Maximum number is: " + maxIndex);


        // 4.
        Library library = new Library();
        library.populateList();
        System.out.println(library.getBooks());
    }


    public static void print(List<Integer> integers) {
        System.out.print("List of {");
        for(int i = 0; i < integers.size()-1; i++) {
            System.out.print(integers.get(i) + ", ");
        }
        System.out.println(integers.getLast() + "}");
    }
}