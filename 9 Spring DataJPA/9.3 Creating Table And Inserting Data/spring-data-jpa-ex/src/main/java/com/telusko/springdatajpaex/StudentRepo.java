package com.telusko.springdatajpaex;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.telusko.springdatajpaex.model.Student;

@Repository
public interface StudentRepo extends JpaRepository<Student, Integer> {

}
