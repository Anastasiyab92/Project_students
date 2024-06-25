package pl.zlat.springstudents.Controller;

import lombok.AllArgsConstructor;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import pl.zlat.springstudents.Service.StudentService;
import pl.zlat.springstudents.model.Student;

import java.util.List;

@RestController
@RequestMapping("students")
@AllArgsConstructor
public class StudentController {

    private final StudentService studentService;

    @GetMapping
    public List<Student> findAllStudent(){
        return studentService.findAllStudent();
    }

    @PostMapping("save_student")
    public Student saveStudent(@RequestBody Student student){
        return studentService.saveStudent(student);
    }

    @GetMapping("/{email}")
    public Student findStudentByEmail(@PathVariable String email){
        return studentService.findEmail(email);
    }

    @PutMapping("update_student")
    public Student updateStudent(@RequestBody Student student){
        return studentService.updateStudent(student);
    }

    @DeleteMapping("delete_student/{email}")
    @Transactional
    public void deleteStudent(@PathVariable String email){
        studentService.deleteStudent(email);
    }
}
