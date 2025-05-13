package Database;

import Model.Subject;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class SubjectsDAO {
    private final DatabaseConnectionManager dcm;

    public SubjectsDAO() {
        final String URL = "jdbc:postgresql://localhost:5432/School";
        final String USER = "postgres";
        final String PASSWORD = "mskhj26";

        this.dcm = new DatabaseConnectionManager(
                URL, USER, PASSWORD
        );
    }

    public Subject createSubject(Subject subject) {
        String INSERT_SUBJECT = "INSERT INTO subjects (subject_name) VALUES (?);";

        String subjectName = subject.getSubjectName();

        try (Connection con = dcm.getConnection()) {
            PreparedStatement ps = con.prepareStatement(INSERT_SUBJECT);
            ps.setString(1, subjectName);
            ps.execute();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return subject;
    }

    public List<Subject> findAll() {
        String FIND_ALL = "SELECT * FROM subjects;";

        try(Connection con = dcm.getConnection()) {
            PreparedStatement ps = con.prepareStatement(FIND_ALL);
            ResultSet set = ps.executeQuery();

            List<Subject> subjects = new ArrayList<>();

            while(set.next()) {
                subjects.add(
                        new Subject(
                                set.getInt(1),
                                set.getString(2)
                        )
                );
            }

            return subjects;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return List.of();
    }

    public Subject findById(int id) {
        String FIND_BY_ID = "SELECT * FROM subjects WHERE id = ?;";

        try(Connection con = dcm.getConnection()) {
            PreparedStatement ps = con.prepareStatement(FIND_BY_ID);
            ps.setInt(1, id);
            ResultSet set = ps.executeQuery();

            while(set.next()) {
                if(set.getInt(1) == id) {
                    return new Subject(
                            id,
                            set.getString(2)
                    );
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    public Subject update(Subject subject) {
        String UPDATE = """
                    UPDATE subjects
                    SET subject_name = ?
                    WHERE id = ?;
                """;

        try(Connection con = dcm.getConnection()) {
            PreparedStatement ps = con.prepareStatement(UPDATE);
            ps.setString(1, subject.getSubjectName());
            ps.setInt(2, subject.getId());
            ps.execute();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return subject;
    }

    public void deleteById(int id) {
        String DELETE = "DELETE FROM subjects WHERE id = ?;";

        try(Connection con = dcm.getConnection()) {
            PreparedStatement ps = con.prepareStatement(DELETE);
            ps.setInt(1, id);
            ps.execute();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
