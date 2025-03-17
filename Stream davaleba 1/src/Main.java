import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        // 1.

        ArrayList<Integer> numbers = new ArrayList<>(
                List.of(1,6,3,4,10,11,15,3,18,90,20)
        );

        double sum = numbers.stream()
                .filter(n -> n>=10)
                .map(n -> Math.pow(n, 2))
                .reduce((double) 0, Double::sum);

        System.out.println((int) sum);

        // 2.

        List<String> words = new ArrayList<>(
                List.of("Tazo", "Jerom", "lorem", "ipsum", "Jaja", "Jixvi")
        );

        List<String> result = words.stream()
                .filter(str -> str.charAt(0) == 'J')
                .map(String::toUpperCase)
                .toList();

        result.forEach(System.out::println);

        // 3.

        List<String> strings = new ArrayList<>(
                List.of("algorythm", "hello", "world", "word", "Java", "Python", "book")
        );

        Set<String> set = strings.stream()
                .sorted()
                .collect(Collectors.toCollection(LinkedHashSet::new));

        set.forEach(System.out::println);

        // 4.

        List<Human> humans = new ArrayList<>(
                List.of(
                        new Human("Tazo", 15),
                        new Human("Levani", 24),
                        new Human("Nikolozi", 12),
                        new Human("Sophie", 10),
                        new Human("Lika", 36),
                        new Human("Levani", 9)
                )
        );

        humans = humans.stream()
                .filter(human -> human.getAge() >= 15)
                .toList();

        boolean ans = humans.stream()
                        .anyMatch(human -> human.getName().equals("Levani"));

        System.out.println(ans);

        // 5.

        List<Integer> nums = new ArrayList<>(
                List.of(1,5,2,6,73,62,7,3,9,10,22,13,27)
        );

        Integer secondMinNumber = nums.stream()
                .mapToInt(value -> value)
                .sorted()
                .skip(1)
                .min()
                .orElseThrow(NoSuchElementException::new);

        System.out.println(secondMinNumber);

        List<Integer> list = new ArrayList<>(nums.stream()
                .mapToInt(v -> v)
                .sorted()
                .boxed()
                .toList());

        Collections.reverse(list);
        Integer secondMaxNumber = list.stream()
                .skip(1)
                .mapToInt(v -> v)
                .max()
                .orElseThrow(NoSuchElementException::new);

        System.out.println(secondMaxNumber);
    }
}