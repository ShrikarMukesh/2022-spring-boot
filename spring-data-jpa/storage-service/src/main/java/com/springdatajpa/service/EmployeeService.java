package com.springdatajpa.service;


import com.springdatajpa.model.Employee;
import com.springdatajpa.respository.EmployeeResiotory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class EmployeeService {

    @Autowired
    EmployeeResiotory employeeResiotory;

    public Employee addNewEmployee(Employee employee){
        employee.setEmpId(new Random().nextInt(68736432));
        //add employee to database
        Employee employee1 = employeeResiotory.save(employee);
        return employee1;
    }
}