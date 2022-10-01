package com.springdatajpa.entity;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class Subject {
    private String subcode;
    private String name;
    private String teacher;
    private String marks;

}
