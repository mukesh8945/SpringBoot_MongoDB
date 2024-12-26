package com.example.demo.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.demo.model.Student;
import com.example.demo.repo.StudentRepository;

@Component
public class StudentDataRunner implements CommandLineRunner {

	@Autowired
	private StudentRepository repo;

	@Override
	public void run(String... args) throws Exception {
		Student s1 = repo.save(new Student(101, "A", 2.3));
		repo.save(new Student(102, "B", 3.3));
		repo.save(new Student(103, "C", 4.3));
		repo.save(new Student(104, "D", 5.3));

		System.out.println("PrimaryKey => " + s1.getEmpId());
		System.out.println("------------");
		repo.findAll().forEach(System.out::println);

	}

}
