package com.sm.service;

import com.sm.entity.Student;
import com.sm.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;

    public List<Student> studentList(){
        return studentRepository.findAll();
    }
}
