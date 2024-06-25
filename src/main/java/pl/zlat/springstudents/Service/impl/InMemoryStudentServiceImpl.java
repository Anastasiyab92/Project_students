package pl.zlat.springstudents.Service.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import pl.zlat.springstudents.Service.StudentService;
import pl.zlat.springstudents.model.Student;
import pl.zlat.springstudents.repository.InMemoryStudentDAO;

import java.util.List;

@Service
@AllArgsConstructor
public class InMemoryStudentServiceImpl implements StudentService {

    private final InMemoryStudentDAO inMemoryStudentDAO;

    @Override
    public List<Student> findAllStudent() {
        return inMemoryStudentDAO.findAllStudent();
    }

    @Override
    public Student saveStudent(Student student) {
        return inMemoryStudentDAO.saveStudent(student);
    }

    @Override
    public Student findEmail(String email) {
        return inMemoryStudentDAO.findEmail(email);
    }

    @Override
    public Student updateStudent(Student student) {
        return inMemoryStudentDAO.updateStudent(student);
    }

    @Override
    public void deleteStudent(String email) {
       inMemoryStudentDAO.deleteStudent(email);
    }
}
