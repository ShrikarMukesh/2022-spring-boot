package com.giraffe.controller;

import com.giraffe.model.Employee;
import com.giraffe.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/employees")
    public List<Employee> employeeList(){
        return employeeService.employeeList();
    }

    @GetMapping("/employees/{empId}")
    public Optional<Employee> getEmployeeById(@PathVariable int empId){
        return employeeService.getEmployee(empId);
    }

    @PostMapping("/addEmployee")
    public Employee createEmployee(@RequestBody Employee employee){
        return employeeService.createEmployee(employee);
    }
}
