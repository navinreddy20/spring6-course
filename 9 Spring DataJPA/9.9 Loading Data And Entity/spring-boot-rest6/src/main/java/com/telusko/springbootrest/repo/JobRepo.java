package com.telusko.springbootrest.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.telusko.springbootrest.model.JobPost;

@Repository
public interface JobRepo extends JpaRepository<JobPost, Integer> {

	

	
	
	

	

	


}
