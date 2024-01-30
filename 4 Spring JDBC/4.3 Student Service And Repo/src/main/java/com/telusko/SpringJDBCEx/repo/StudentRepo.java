package com.telusko.SpringJDBCEx.repo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.telusko.SpringJDBCEx.model.Student;

@Repository
public class StudentRepo {

	public void save(Student s) {
	
		System.out.println("Added");
	}

	public List<Student> findAll() {
		
	List<Student> students=new ArrayList<>();
	return students;
	}

	
}
