package pl.zlat.springstudents.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.zlat.springstudents.model.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

    void deleteByEmail(String email);
    Student findStudentsByEmail(String email);
}
