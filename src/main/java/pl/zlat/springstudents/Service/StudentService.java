package pl.zlat.springstudents.Service;

import pl.zlat.springstudents.model.Student;

import java.util.List;


public interface StudentService {

     List<Student> findAllStudent();
     Student saveStudent(Student student);
     Student findEmail(String email);
     Student updateStudent(Student student);
     void deleteStudent(String email);
}
