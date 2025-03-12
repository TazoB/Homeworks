package savarjisho2;

import java.util.ArrayList;

public class Student {
    private String firstName;
    private String lastName;
    private String date;
    private ArrayList<Integer> marks;

    public Student(String firstName, String lastName, String date, ArrayList<Integer> marks) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.date = date;
        this.marks = marks;
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

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public ArrayList<Integer> getMarks() {
        return marks;
    }

    public void setMarks(ArrayList<Integer> marks) {
        this.marks = marks;
    }

    public double averageMark() {
        int sum = 0;
        for (Integer mark : marks) {
            sum += mark;
        }
        return (double) sum / marks.size();
    }

    @Override
    public String toString() {
        return "savarjisho2.Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", date='" + date + '\'' +
                ", marks=" + marks +
                '}';
    }
}
