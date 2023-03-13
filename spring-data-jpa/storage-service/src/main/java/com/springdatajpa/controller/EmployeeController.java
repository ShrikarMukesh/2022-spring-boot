package com.springdatajpa.controller;


import com.springdatajpa.model.Employee;
import com.springdatajpa.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    @Autowired
    private EmployeeService service;

    @PostMapping
    public Employee addNewEmployeeToSystem(@RequestBody @Valid Employee employee){
        return service.addNewEmployee(employee);
    }

    @PostMapping("/updateEmpType")
    public int updateEmployeeData(@RequestBody @Valid List<Employee> employees){
       return service.updateEmployeeType(employees);
    }

    @PutMapping("/update")
    public List<Employee> updateEmployeeTypeData(@RequestBody @Valid List<Employee> employees){
        return service.updateEmployeeTypeNew(employees);
    }
}