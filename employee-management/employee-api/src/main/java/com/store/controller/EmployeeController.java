package com.store.controller;

import com.store.model.Employee;
import com.store.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.List;

@RestController
@RequestMapping("/api/v1/")
@Slf4j
@RequiredArgsConstructor
public class EmployeeController {

    private final EmployeeService employeeService;

    @GetMapping("hi")
    public String hi(){
        return "Hello World";
    }

    @GetMapping("/emplist")
    public List<Employee> employees(){
        return employeeService.listOfEmployee();
    }

    @GetMapping("/ceo")
    public Collection<Employee> ceoslist(){
        return employeeService.ceoslist();
    }

    @GetMapping("/emplist/paginaton")
    public Page<Employee> paginaton(Pageable pageable){
        return employeeService.findAllUsersWithPagination(pageable);
    }
}
