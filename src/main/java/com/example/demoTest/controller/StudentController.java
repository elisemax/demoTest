package com.example.demoTest.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import com.example.demoTest.model.Student;
import com.example.demoTest.service.StudentService;
import java.util.List;

@RestController
@RequestMapping("/api/v1/students")
@AllArgsConstructor
public class StudentController {

    private final StudentService studentService;

    @GetMapping
    public List<Student> getAllStudents() {
        return studentService.findAllStudents();
    }

    @PostMapping("/save")
    public Student saveStudent(@RequestBody Student student) {
        return studentService.saveStudent(student);
    }

    @GetMapping("/find/{email}")
    public Student findStudentByEmail(@PathVariable String email) {
        return studentService.findStudentByEmail(email);
    }

    @PutMapping("/update")
    public Student updateStudent(@RequestBody Student student) {
        return studentService.updateStudent(student);
    }

    @DeleteMapping("/delete/{email}")
    public void deleteStudentByEmail(@PathVariable String email) {
        studentService.deleteStudentByEmail(email);
    }
}
