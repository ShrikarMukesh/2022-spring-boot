package com.springdatajpa.respository;

import com.springdatajpa.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeResiotory extends JpaRepository<Employee,Integer> {
}
