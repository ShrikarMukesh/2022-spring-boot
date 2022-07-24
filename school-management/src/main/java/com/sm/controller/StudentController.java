package com.sm.controller;

import com.sm.entity.Student;
import com.sm.service.StudentService;
import lombok.extern.log4j.Log4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
@Log4j
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/hi")
    public String test(){
        return "Hello World";
    }

    @GetMapping("/students")
    public ResponseEntity<List<Student>> students(){
        return ResponseEntity.ok(studentService.studentList());
    }
}
