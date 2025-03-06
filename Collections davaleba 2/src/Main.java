import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // 1.
        String[] array = {"Hello", "World", "Java", "C++", "World", "Python", "c++", "worLd", "Tazo", "tazo"};
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i].toLowerCase();
        }
        HashMap<String, Integer> words = new HashMap<>();
        for (String s : array) {
            if(words.containsKey(s)) {
                words.put(s, words.get(s)+1);
            } else {
                words.put(s, 1);
            }
        }
        System.out.println(words);
    }
}