package com.telusko.springsecdemo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

	List<Student> students=new ArrayList<>(List.of(
			new Student(1,"Navin","Java"),
			new Student(2,"Kiran","Blockchain")
			));
	
	@GetMapping("students")
	public List<Student> getStudents(){
		return students;
	}
	@PostMapping("students")
	public void addStudent(@RequestBody Student student) {
		students.add(student);
	}
}
