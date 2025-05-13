package Database;

import Model.Teacher;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class TeachersDAO {
    private final DatabaseConnectionManager dcm;

    public TeachersDAO() {
        final String URL = "jdbc:postgresql://localhost:5432/School";
        final String USER = "postgres";
        final String PASSWORD = "mskhj26";

        this.dcm = new DatabaseConnectionManager(
                URL, USER, PASSWORD
        );
    }

    public Teacher createTeacher(Teacher teacher) {
        String INSERT_TEACHER = "INSERT INTO teachers (first_name, last_name, subject, salary) VALUES (?, ?, ?, ?);";

        String firstName = teacher.getFirstName();
        String lastName = teacher.getLastName();
        int subject = teacher.getSubject();
        int salary = teacher.getSalary();

        try (Connection con = dcm.getConnection()) {
            PreparedStatement ps = con.prepareStatement(INSERT_TEACHER);
            ps.setString(1, firstName);
            ps.setString(2, lastName);
            ps.setInt(3, subject);
            ps.setInt(4, salary);
            ps.execute();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return teacher;
    }

    public List<Teacher> findAll() {
        String FIND_ALL = "SELECT * FROM subjects;";

        try(Connection con = dcm.getConnection()) {
            PreparedStatement ps = con.prepareStatement(FIND_ALL);
            ResultSet set = ps.executeQuery();

            List<Teacher> teachers = new ArrayList<>();

            while(set.next()) {
                teachers.add(
                        new Teacher(
                                set.getInt(1),
                                set.getString(2),
                                set.getString(3),
                                set.getInt(4),
                                set.getInt(5)
                        )
                );
            }

            return teachers;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return List.of();
    }

    public Teacher findById(int id) {
        String FIND_BY_ID = "SELECT * FROM teachers WHERE id = ?;";

        try(Connection con = dcm.getConnection()) {
            PreparedStatement ps = con.prepareStatement(FIND_BY_ID);
            ps.setInt(1, id);
            ResultSet set = ps.executeQuery();

            while(set.next()) {
                if(set.getInt(1) == id) {
                    return new Teacher(
                            id,
                            set.getString(2),
                            set.getString(3),
                            set.getInt(4),
                            set.getInt(5)
                    );
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    public Teacher update(Teacher teacher) {
        String UPDATE = """
                    UPDATE teachers
                    SET first_name = ?
                    SET last_name = ?
                    SET subject = ?
                    SET salary = ?
                    WHERE id = ?;
                """;

        try(Connection con = dcm.getConnection()) {
            PreparedStatement ps = con.prepareStatement(UPDATE);
            ps.setString(1, teacher.getFirstName());
            ps.setString(2, teacher.getLastName());
            ps.setInt(3, teacher.getSubject());
            ps.setInt(4, teacher.getSalary());
            ps.setInt(5, teacher.getId());
            ps.execute();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return teacher;
    }

    public void deleteById(int id) {
        String DELETE = "DELETE FROM teachers WHERE id = ?;";

        try(Connection con = dcm.getConnection()) {
            PreparedStatement ps = con.prepareStatement(DELETE);
            ps.setInt(1, id);
            ps.execute();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
