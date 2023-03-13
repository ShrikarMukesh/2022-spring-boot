package com.springdatajpa.respository;

import com.springdatajpa.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Repository
public interface EmployeeResiotory extends JpaRepository<Employee,Integer> {

    @Modifying
    @Query(value = "update employee e set e.employee_type  = ? where e.employee_type  = ?", nativeQuery = true)
    int updateEmployeeType1(List<Employee> employees);

    @Modifying
    @Query(value = "Update employee e set e.employee_type  = :employee_type  where e.dept = :dept", nativeQuery = true)
    int updateEmployeeType(@Param("employee_type") String employee_type, @Param("dept") String dept);

    @Modifying
    @Query(value = "Update employee e set e.employee_type  = :employee_type  where e.dept = :dept", nativeQuery = true)
    Employee updateEmployeeTypeNew(@Param("employee_type") String employee_type, @Param("dept") String dept);
}
