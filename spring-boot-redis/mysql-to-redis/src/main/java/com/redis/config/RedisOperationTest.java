package com.redis.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class RedisOperationTest implements CommandLineRunner{

	@Autowired
	public StudentDAO studentDAO;

	@Override
	public void run(String... args) throws Exception {
		studentDAO.addStudent(new Student(96, "Shrikar", 233333.23));
		studentDAO.addStudent(new Student(97, "Dinesh", 12233.23));
		studentDAO.addStudent(new Student(98, "Pratap", 441223.23));
		studentDAO.getAllStudents().forEach((t, u) -> System.out.println(t + "   " + u));
		studentDAO.removeStudent(96);
		studentDAO.modifyStudent(new Student(98, "Pratap Gaurav", 21222.22));
		
		System.out.println("After Removel and Updating");
		studentDAO.getAllStudents().forEach((t, u) -> System.out.println(t + "   " + u));
	}

}
