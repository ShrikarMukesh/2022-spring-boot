package com.springdatajpa;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Test {


    public static void main(String[] args) {
        Test t1 = new Test();
        int a = t1.hashCode();
        System.out.println(a);
        System.out.println("Hello");
        /*
        List<String> courses = Arrays.asList("Java", "DSA-Uttara","SpringBoot","Microservice","DevOps","ReactJS","AWS-Solution-Architect","DSA-JLC");
        for (String str : courses){
            System.out.print(str + " ");
        }
        System.out.println();
        for (int i=0;i< courses.size();i++){
            String course = courses.get(i);
            System.out.print(course+ " ");
        }System.out.println();
        Iterator<String> stringIterator = courses.iterator();
        while (stringIterator.hasNext()){
            String course = stringIterator.next();
            System.out.print(course + " ");
        }
        courses.forEach(cou-> System.out.println(cou));
        System.out.println("\n Stream Iteration");
        courses.stream().forEach(System.out::print);

         */
    }
}
