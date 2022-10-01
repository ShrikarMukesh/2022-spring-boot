package com.springdatajpa.entity;

import lombok.*;

import java.util.List;


@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Student {
    private String id;
    private String name;
    private String email;
    private Address address;
    private List<Subject> subject;
}
