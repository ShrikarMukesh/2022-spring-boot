package com.springdatajpa.controller;

import com.springdatajpa.dto.StudentResponse;
import com.springdatajpa.entity.Student;
import com.springdatajpa.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/students")
    public List<StudentResponse> students(){
        return studentService.studentList();
    }
}
