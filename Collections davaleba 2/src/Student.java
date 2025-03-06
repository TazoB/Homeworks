import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Student implements Comparable<Student>{
    private String ID;
    private String firstName;
    private String lastName;
    private Map<String, List<Double>> marks;

    public Student(HashMap<String, List<Double>> marks, String lastName, String firstName, String ID) {
        this.marks = marks;
        this.lastName = lastName;
        this.firstName = firstName;
        this.ID = ID;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Map<String, List<Double>> getMarks() {
        return marks;
    }

    public void setMarks(HashMap<String, List<Double>> marks) {
        this.marks = marks;
    }

    public double averageMark() {
        double sum = 0;
        int count = 0;
        for(Map.Entry<String, List<Double>> entry : this.marks.entrySet()) {
            List<Double> list = entry.getValue();
            for (Double d : list) {
                sum+=d;
                count++;
            }
        }
        return sum/count;
    }

    @Override
    public int compareTo(Student o) {
        return Double.compare(this.averageMark(), o.averageMark());
    }
}
