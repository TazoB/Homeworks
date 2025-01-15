package exercise1;

public class TestClass {
    public static void main(String[] args) {
        University university = new University("თბილისის სახელმწიფო უნივერსიტეტი", "სახელმწიფო", 10);
        University.Student student = university.new Student("მარიამი", "გიორგაძე", 20, "123456789", 8.5, "იურიდიული");
        university.printInfo();
        System.out.println();
        student.printInfo();
    }
}
