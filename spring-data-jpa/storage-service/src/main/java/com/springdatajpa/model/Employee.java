package com.springdatajpa.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.springdatajpa.validation.ValidateEmployeeType;
import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.*;
import java.sql.Date;
import java.time.LocalDate;

@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "employee")
public class Employee {
    //it should auto generate
    @Id
    @GeneratedValue
    private int empId;
    @NotBlank(message = "firstName shouldn't be null or empty")
    private String firstName;
    @NotBlank(message = "lastName shouldn't be null or empty")
    private String lastName;
    @Past(message = "start shouldn't be before current date")
    @JsonFormat(pattern = "dd-MM-yyyy")
    private Date doj;
    @NotNull(message = "department shouldn't be null")
    @NotEmpty(message = "department shouldn't be empty")
    private String dept;
    @Email(message = "invalid email id")
    private String email;

    //custom annotation
    @ValidateEmployeeType
    @Column(name = "employee_type")
    private String employeeType; //permanent or vendor or contractual
}