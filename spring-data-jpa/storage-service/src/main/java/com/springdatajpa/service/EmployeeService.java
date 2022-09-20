package com.springdatajpa.service;


import com.springdatajpa.model.Employee;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class EmployeeService {

    public Employee addNewEmployee(Employee employee){
        employee.setEmpId(new Random().nextInt(68736432));
        //add employee to database
        return employee;
    }
}