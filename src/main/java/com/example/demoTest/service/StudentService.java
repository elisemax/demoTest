package com.example.demoTest.service;

import com.example.demoTest.model.Student;
import java.util.List;


public interface StudentService {
    List<Student> findAllStudents();
    Student saveStudent(Student student);
    Student findStudentByEmail(String email);
    void deleteStudentByEmail(String email);

    Student updateStudent(Student student);
}
