package com.store.model;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.ToString;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Data
@RequiredArgsConstructor
@ToString
@Entity
@Table(name = "employees")
public class Employee {

    @Id
    @Column(name = "employee_id")
    private long employeeId;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "job_title")
    private String jobTitle;

    @Column(name = "salary")
    private long salary;

    @Column(name = "reports_to")
    private String reportsTo;

    @Column(name = "office_id")
    private int officeId;

}
