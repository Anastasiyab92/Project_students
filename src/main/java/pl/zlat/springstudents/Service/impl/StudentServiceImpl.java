package pl.zlat.springstudents.Service.impl;

import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import pl.zlat.springstudents.Service.StudentService;
import pl.zlat.springstudents.model.Student;
import pl.zlat.springstudents.repository.StudentRepository;

import java.util.List;

@Service
@Primary
@AllArgsConstructor
public class StudentServiceImpl implements StudentService {

    private final StudentRepository studentRepository;

    @Override
    public List<Student> findAllStudent() {
        return studentRepository.findAll();
    }

    @Override
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }


    @Override
    public Student updateStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public Student findEmail(String email) {
        return studentRepository.findStudentsByEmail(email);
    }

    @Override
    public void deleteStudent(String email) {
        studentRepository.deleteByEmail(email);
    }
}
