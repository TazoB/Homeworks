import java.io.Serializable;
import java.util.List;

public class Student implements Serializable, Comparable<Student> {
    private static final long SerialVersionUID = 1;
    private int Id;
    private String firstName;
    private String lastName;
    private int year;
    private double averageScore;
    private List<String> subjects;

    public Student(int id, String firstName, String lastName, int year, double averageScore, List<String> subjects) {
        Id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.year = year;
        this.averageScore = averageScore;
        this.subjects = subjects;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
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

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getAverageScore() {
        return averageScore;
    }

    public void setAverageScore(double averageScore) {
        this.averageScore = averageScore;
    }

    public List<String> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<String> subjects) {
        this.subjects = subjects;
    }

    @Override
    public boolean equals(Object obj) {
        Student student = (Student) obj;
        if(student.getId() != this.Id) return false;

        if(this.getSubjects().size() != student.getSubjects().size()) return false;

        for (String subject : student.getSubjects()) {
            if(!this.getSubjects().contains(subject)) return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        return (int) ((this.firstName.hashCode() * Id) / (averageScore + 1));
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("Student: {" +
                "\n\tid: " + Id + "," +
                "\n\tfirstName: " + firstName + "," +
                "\n\tlastName: " + lastName + "," +
                "\n\tyear: " + year + "," +
                "\n\tavgScore: " + averageScore + "," +
                "\n\tsubjects: {");

        for (int i = 0; i < subjects.size()-1; i++) {
            result.append("\n\t");
            result.append(subjects.get(i) + ",");
        }
        result.append("\n\t").append(subjects.getLast());
        result.append("\n\t}");
        result.append("\n}");
        return result.toString();
    }

    @Override
    public int compareTo(Student o) {
        return Double.compare(this.averageScore, o.averageScore);
    }


}
