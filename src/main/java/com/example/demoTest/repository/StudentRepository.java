package com.example.demoTest.repository;

import com.example.demoTest.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository  extends JpaRepository<Student, Long> {
    void deleteStudentByEmail(String email);
    Student findStudentByEmail(String email);
}
