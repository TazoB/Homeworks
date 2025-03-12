package savarjisho2;

import java.util.Comparator;

public class CompareWithAverageMark implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return Double.compare(o1.averageMark(), o2.averageMark());
    }
}
