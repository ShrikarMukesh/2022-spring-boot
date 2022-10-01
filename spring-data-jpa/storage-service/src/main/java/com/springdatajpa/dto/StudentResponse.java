package com.springdatajpa.dto;

import com.springdatajpa.entity.Address;
import com.springdatajpa.entity.Subject;
import lombok.*;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class StudentResponse {
    private String name;
    private String email;
    private Address address;
    private List<Subject> subject;
}
