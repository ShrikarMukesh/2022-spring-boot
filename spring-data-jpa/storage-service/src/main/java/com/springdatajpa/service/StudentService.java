package com.springdatajpa.service;

import com.springdatajpa.db.StudentDB;
import com.springdatajpa.dto.StudentResponse;
import com.springdatajpa.entity.*;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class StudentService {


    public List<StudentResponse> studentList(){
        List<Student> students = StudentDB.students();
        return students.stream().map(this::mapToStudentResponse).collect(Collectors.toList());
    }
    private StudentResponse mapToStudentResponse(Student student) {
        return StudentResponse.builder()
                .name(student.getName())
                .email(student.getEmail())
                .address(student.getAddress())
                .subject(student.getSubject())
                .build();
    }
}
