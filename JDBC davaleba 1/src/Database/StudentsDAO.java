package Database;

import Model.Student;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class StudentsDAO {
    private final DatabaseConnectionManager dcm;

    public StudentsDAO() {
        final String URL = "jdbc:postgresql://localhost:5432/School";
        final String USER = "postgres";
        final String PASSWORD = "mskhj26";

        this.dcm = new DatabaseConnectionManager(
                URL, USER, PASSWORD
        );
    }

    public Student createStudent(Student student) {
        String INSERT_STUDENT = "INSERT INTO students (first_name, last_name, grade) VALUES (?, ?, ?);";

        String firstName = student.getFirstName();
        String lastName = student.getLastName();
        int grade = student.getGrade();

        try (Connection con = dcm.getConnection()) {
            PreparedStatement ps = con.prepareStatement(INSERT_STUDENT);
            ps.setString(1, firstName);
            ps.setString(2, lastName);
            ps.setInt(3, grade);
            ps.execute();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return student;
    }

    public List<Student> findAll() {
        String FIND_ALL = "SELECT * FROM students;";

        try(Connection con = dcm.getConnection()) {
            PreparedStatement ps = con.prepareStatement(FIND_ALL);
            ResultSet set = ps.executeQuery();

            List<Student> students = new ArrayList<>();

            while(set.next()) {
                students.add(
                        new Student(
                                set.getInt(1),
                                set.getString(2),
                                set.getString(3),
                                set.getInt(4)
                        )
                );
            }

            return students;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return List.of();
    }

    public Student findById(int id) {
        String FIND_BY_ID = "SELECT * FROM students WHERE id = ?;";

        try(Connection con = dcm.getConnection()) {
            PreparedStatement ps = con.prepareStatement(FIND_BY_ID);
            ps.setInt(1, id);
            ResultSet set = ps.executeQuery();

            while(set.next()) {
                if(set.getInt(1) == id) {
                    return new Student(
                            id,
                            set.getString(2),
                            set.getString(3),
                            set.getInt(4)
                    );
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    public Student update(Student student) {
        String UPDATE = """
                    UPDATE students
                    SET first_name = ?
                    SET last_name = ?
                    SET grade = ?
                    WHERE id = ?;
                """;

        try(Connection con = dcm.getConnection()) {
            PreparedStatement ps = con.prepareStatement(UPDATE);
            ps.setString(1, student.getFirstName());
            ps.setString(2, student.getLastName());
            ps.setInt(3, student.getGrade());
            ps.setInt(4, student.getId());
            ps.execute();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return student;
    }

    public void deleteById(int id) {
        String DELETE = "DELETE FROM students WHERE id = ?;";

        try(Connection con = dcm.getConnection()) {
            PreparedStatement ps = con.prepareStatement(DELETE);
            ps.setInt(1, id);
            ps.execute();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
