package com.giraffe.service;

import com.giraffe.model.Employee;
import com.giraffe.repo.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public List<Employee> employeeList(){
        return employeeRepository.findAll();
    }

    public Optional<Employee> getEmployee(int id){
        return employeeRepository.findById(id);
    }

    public Employee createEmployee(Employee employee){
        return employeeRepository.save(employee);
    }
}
