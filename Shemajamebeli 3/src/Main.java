import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // 1. b
        // 2. a
        // 3. a, b, d
        // 4. b
        // 5. a, c
        // 6. b
        // 7. c
        // 8. b
        // 9. b
        // 10. c
        // 11. c
        // 12. b
        // 13. a, b, c, d
        // 14. b, d
        // 15. b, c


        // 16.

        ArrayList <Student> students = new ArrayList<>();

        try {
            BufferedReader br =  new BufferedReader(new FileReader("src/StudentsTextFile.txt"));
            String line;
            while ((line = br.readLine()) != null) {
                String[] attributes = line.split(",");
                int Id = Integer.parseInt(attributes[0]);
                String firstName = attributes[1];
                String lastName = attributes[2];
                int year = Integer.parseInt(attributes[3]);
                double averageScore = Double.parseDouble(attributes[4]);
                List<String> subjects = new ArrayList<>(Arrays.asList(attributes).subList(5, attributes.length));

                students.add(new Student(Id, firstName, lastName, year, averageScore, subjects));
            }
            br.close();
        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }


        try (ObjectOutputStream oos = new ObjectOutputStream(
                new FileOutputStream("src/serializableStudentsFile.ser")
        )) {
            for (Student student : students) {
                oos.writeObject(student);
            }
        } catch (IOException ioe) {
            System.out.println(ioe.getMessage());
        }


        ArrayList <Student> students1 = new ArrayList<>();

        try (ObjectInputStream ois = new ObjectInputStream(
                new FileInputStream("src/serializableStudentsFile.ser")
        )) {
            while(ois.available() != -1) {
                students1.add((Student) ois.readObject());
            }
        } catch (IOException | ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }

        students1.forEach(System.out::println);



        // 17.
        Collections.sort(students1, new CompareWithAverageScore());
        Collections.sort(students1);
        students1.forEach(System.out::println);

    }
}