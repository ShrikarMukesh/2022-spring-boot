package com.springdatajpa.entity;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class Address {
    private Home home;
    private Office office;
}
