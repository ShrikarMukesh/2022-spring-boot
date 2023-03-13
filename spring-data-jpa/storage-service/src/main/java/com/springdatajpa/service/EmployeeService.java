package com.springdatajpa.service;


import com.springdatajpa.model.Employee;
import com.springdatajpa.respository.EmployeeResiotory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
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

    @Transactional
    public int updateEmployeeType(List<Employee> employees) {
        int lastResult = 0;
        for(Employee employee : employees){
            int result = employeeResiotory.updateEmployeeType(employee.getEmployeeType() , employee.getDept());
            lastResult = lastResult + result;
        }
        return lastResult;

    }

    @Transactional
    public List<Employee> updateEmployeeTypeNew(List<Employee> employees) {

        List<Employee> lastResult = new ArrayList<>();
        for(Employee employee : employees){
            Employee result = employeeResiotory.updateEmployeeTypeNew(employee.getEmployeeType() , employee.getDept());
            lastResult.add(result);
        }
        return lastResult;
    }
}