package com.springdatajpa.db;

import com.springdatajpa.entity.*;

import java.util.Arrays;
import java.util.List;

public class StudentDB {
    public static List<Student> students(){
        Student shrikar =  Student.builder()
                .id("1DA12CS96")
                .name("Shrikar")
                .email("shrikar@gmail.com")
                .subject(Arrays.asList(new Subject("CS003","Complier Design","Harsih","75"),
                        new Subject("CS004","DSA","Asharani","85")))
                .address(new Address(new Home("122","rudrwadi main road", 585314,"Kalaburgi","karnataka"),
                        new Office("123", "aland main road",585102,"Aland","karnataka")))
                .build();
        Student jaipal =  Student.builder()
                .id("1DA12CS108")
                .name("Jaipal")
                .address(new Address(new Home("902","chalkare", 53443,"durga","karnataka"),
                        new Office("232", "Murga swmy",531489,"durga-19","karnataka")))
                .email("jaipal@gmail.com").build();
        return Arrays.asList(shrikar,jaipal);
    }
}
