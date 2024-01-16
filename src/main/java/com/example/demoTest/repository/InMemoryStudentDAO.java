package com.example.demoTest.repository;

import com.example.demoTest.model.Student;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class InMemoryStudentDAO {
    private final List<Student> STUDENTS = new ArrayList<>();

    public List<Student> findAllStudents(){
        return STUDENTS;
    }

    public Student saveStudent(Student student){
        STUDENTS.add(student);
        return student;
    }


    public Student findStudentByEmail(String email) {
        return STUDENTS.stream().filter(student -> student.getEmail()
                .equals(email))
                .findFirst()
                .orElseThrow(() -> new IllegalStateException("Student " + email + " does not exist"));
    }

    public Student updateStudent(Student student){
        var studentToUpdate = findStudentByEmail(student.getEmail());
        if(studentToUpdate != null){
            STUDENTS.remove(studentToUpdate);
            STUDENTS.add(student);
            return student;
        }
        return STUDENTS.stream().filter(s -> s.getEmail().equals(student.getEmail())).findFirst().orElse(null);
    }

    public void deleteStudentByEmail(String email) {
        Student student = findStudentByEmail(email);
        STUDENTS.remove(student);
    }
}
