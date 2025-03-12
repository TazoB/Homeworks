package savarjisho2;

import java.util.Comparator;

public class CompareLexicographically implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        String first = o1.getFirstName() + o1.getLastName();
        String second = o2.getFirstName() + o2.getLastName();

        return first.compareTo(second);
    }
}
