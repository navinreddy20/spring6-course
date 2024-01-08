package com.telusko.SpringJDBCEx;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.telusko.SpringJDBCEx.model.Student;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
ApplicationContext context=	SpringApplication.run(Application.class, args);
  Student s= context.getBean(Student.class);
  s.setRollNo(101);
  s.setName("Navin");
  s.setMarks(78);
    addStudent(s);
	}

}
