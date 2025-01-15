package exercise1;

public class University {
    private String name;
    private String status;
    private int numberOfFaculties;

    public University(String title, String status, int numberOfFaculties) {
        this.name = title;
        this.status = status;
        this.numberOfFaculties = numberOfFaculties;
    }

    public String getTitle() {
        return name;
    }

    public void setTitle(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getNumberOfFaculties() {
        return numberOfFaculties;
    }

    public void setNumberOfFaculties(int numberOfFaculties) {
        this.numberOfFaculties = numberOfFaculties;
    }

    public void printInfo() {
        System.out.println("Name: " + name);
        System.out.println("Status: " + status);
        System.out.println("Number of faculties: " + numberOfFaculties);
    }



    public class Student {
        private String firstName;
        private String secondName;
        private int age;
        private String IDNumber;
        private double averageScore;
        private String faculty;

        public Student(String firstName, String secondName, int age, String IDNumber, double averageScore, String faculty) {
            this.firstName = firstName;
            this.secondName = secondName;
            this.age = age;
            this.IDNumber = IDNumber;
            this.averageScore = averageScore;
            this.faculty = faculty;
        }

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getSecondName() {
            return secondName;
        }

        public void setSecondName(String secondName) {
            this.secondName = secondName;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getIDNumber() {
            return IDNumber;
        }

        public void setIDNumber(String IDNumber) {
            this.IDNumber = IDNumber;
        }

        public double getAverageScore() {
            return averageScore;
        }

        public void setAverageScore(double averageScore) {
            this.averageScore = averageScore;
        }

        public String getFaculty() {
            return faculty;
        }

        public void setFaculty(String faculty) {
            this.faculty = faculty;
        }

        public void printInfo() {
            System.out.println("First Name: " + firstName);
            System.out.println("Second Name: " + secondName);
            System.out.println("Age: " + age);
            System.out.println("ID Number: " + IDNumber);
            System.out.println("Average Score: " + averageScore);
            System.out.println("Faculty: " + faculty);
        }
    }
}
