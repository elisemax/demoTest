package com.example.demoTest.service.impl;

import com.example.demoTest.model.Student;
import com.example.demoTest.repository.InMemoryStudentDAO;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import com.example.demoTest.service.StudentService;

import java.util.List;

@Service
@AllArgsConstructor
public class InMemoryStudentServiceImpl implements StudentService {

    private final InMemoryStudentDAO inMemoryStudentDAO;

    @Override
    public List<Student> findAllStudents(){
        return inMemoryStudentDAO.findAllStudents();
    }
    @Override
    public Student saveStudent(Student student){
        return inMemoryStudentDAO.saveStudent(student);
    }

    @Override
    public Student findStudentByEmail(String email) {
        return inMemoryStudentDAO.findStudentByEmail(email);
    }

    @Override
    public void deleteStudentByEmail(String email) {
        inMemoryStudentDAO.deleteStudentByEmail(email);
    }

    @Override
    public Student updateStudent(Student student){
        return inMemoryStudentDAO.updateStudent(student);
    }
}
