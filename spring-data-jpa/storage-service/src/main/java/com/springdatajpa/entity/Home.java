package com.springdatajpa.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@ToString
@NoArgsConstructor
public class Home {
    private String flatno;
    private String street;
    private int pincode;
    private String city;
    private String state;
}
