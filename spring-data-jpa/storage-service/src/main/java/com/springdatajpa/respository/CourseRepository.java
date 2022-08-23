package com.springdatajpa.respository;


import com.springdatajpa.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface CourseRepository extends JpaRepository<Course, Long> {
    List<Course> findByFeeLessThan(double fee);
}