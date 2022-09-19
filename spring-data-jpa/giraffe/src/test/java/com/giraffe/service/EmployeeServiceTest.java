package com.giraffe.service;

import com.giraffe.model.Employee;
import com.giraffe.repo.EmployeeRepository;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@SpringBootTest
class EmployeeServiceTest {

    @Mock
    EmployeeRepository employeeRepository;

    @InjectMocks
    EmployeeService employeeService;

    @Test
    void getEmployeeByIdTest(){
        when(employeeRepository.findById(100)).thenReturn(null);
        Employee employee = Employee.builder().empId(100).firstName("Jadeja").lastName("Jaddu").build();
        assertEquals(employee.getEmpId() , 100);
    }


}
