public class Main {
    public static void main(String[] args) {
        // 2.
        Student student1 = new Student("Tazo", "Bendianishvili", 19, 1, 100);
        Student student2 = new Student("Irakli", "Kemularia", 20, 2, 80);
        Student student3 = new Student("Lasha", "Ckhelishvili", 21, 3, 90);
        Student student4 = new Student("Giorgi", "Antadze", 22, 4, 80);
        Student student5 = new Student("Dato", "Marjanidze", 20, 2, 100);

        Student[] students = {student1, student2, student3, student4, student5};

        System.out.println(maxGrade(students) + " has the highest grade.");
    }

    public static String maxGrade(Student[] students) {
        double maxGrade = 0;
        String maxName = "";
        String maxSurname = "";

        for (int i = 0; i < students.length; i++) {
            if(students[i].getAverageGrade() > maxGrade){
                maxGrade = students[i].getAverageGrade();
                maxName = students[i].getName();
                maxSurname = students[i].getSurname();
            }
        }

        return maxName + " " + maxSurname;
    }
}