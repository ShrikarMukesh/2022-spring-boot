package com.store.repository;

import com.store.model.Employee;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long> {
    @Query(
            value = "select *" +
                    "from employees emp\n" +
                    "where emp.reports_to IS NULL;",
            nativeQuery = true)
    Collection<Employee> findCEOS();

    @Query(
            value = "SELECT * FROM employees ORDER BY employee_id",
            countQuery = "SELECT count(*) FROM employees",
            nativeQuery = true)
    Page<Employee> findAllUsersWithPagination(Pageable pageable);
}
