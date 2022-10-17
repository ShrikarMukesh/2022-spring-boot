package com.redis.config;

import java.util.Map;

import javax.annotation.Resource;

import org.springframework.data.redis.core.HashOperations;
import org.springframework.stereotype.Service;

@Service 
public class StudentDAOImplementation implements StudentDAO{

	private final String KEY = "STUDENT";


	@Resource(name = "studentRedisTemplate")
	private HashOperations<String, Integer, Student> hashOperations;

	@Override
	public void addStudent(Student student) {
		hashOperations.putIfAbsent(KEY, student.getStdId(), student);
	}

	@Override
	public Student getStdent(Integer id) {
		//Read One Record Based on HashRef and Id
		return hashOperations.get(KEY, id);
	}

	@Override
	public Map<Integer, Student> getAllStudents() {
		//hashRef , get All rows as Map
		return hashOperations.entries(KEY);
	}

	@Override
	public void modifyStudent(Student student) {
		hashOperations.put(KEY, student.getStdId(), student);

	}

	@Override
	public void removeStudent(Integer id) {
		
		hashOperations.delete(KEY, id);

	}

}
