import Database.SubjectsDAO;
import Database.TeachersDAO;
import Model.Subject;
import Model.Teacher;

import java.util.List;

public class TeacherService {
    private TeachersDAO td;
    private SubjectsDAO sd;

    private String getSubjectById(int id) {
        Teacher teacher = td.findById(id);
        List<Subject> subjects = sd.findAll();

        for (Subject subject : subjects) {
            if(subject.getId() == teacher.getSubject()) {
                return subject.getSubjectName();
            }
        }
        return null;
    }
}
