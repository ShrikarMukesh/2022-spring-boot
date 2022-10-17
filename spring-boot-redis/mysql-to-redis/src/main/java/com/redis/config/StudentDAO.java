package com.redis.config;

import java.util.Map;

import org.springframework.stereotype.Service;

@Service
public interface StudentDAO {

	public void addStudent(Student student);  
	public void modifyStudent(Student student);
	public Student getStdent(Integer id);
	public Map<Integer, Student> getAllStudents();
    public void removeStudent(Integer id);
}
