public class Student {
    private String name;
    private String surname;
    private int age;
    private int undergraduateYear;
    private double averageGrade;

    Student() {
        name = "null";
        surname = "null";
        age = 0;
        undergraduateYear = 0;
        averageGrade = 0.0;
    }

    Student(String name, String surname, int age, int undergraduateYear, double averageGrade) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.undergraduateYear = undergraduateYear;
        this.averageGrade = averageGrade;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setUndergraduateYear(int undergraduateYear) {
        this.undergraduateYear = undergraduateYear;
    }

    public void setAverageGrade(double averageGrade) {
        this.averageGrade = averageGrade;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public int getUndergraduateYear() {
        return undergraduateYear;
    }

    public double getAverageGrade() {
        return averageGrade;
    }
}
