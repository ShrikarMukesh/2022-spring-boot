package com.store.service;

import com.store.model.Employee;
import com.store.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    public EmployeeRepository employeeRepository;

    public List<Employee> listOfEmployee(){

        return employeeRepository.findAll(Sort.by(Sort.Direction.ASC, "firstName"));
    }

    public Page<Employee> findAllUsersWithPagination(Pageable pageable){
        return employeeRepository.findAllUsersWithPagination(pageable);
    }

    public Collection<Employee> ceoslist(){
        return  employeeRepository.findCEOS();
    }
}
