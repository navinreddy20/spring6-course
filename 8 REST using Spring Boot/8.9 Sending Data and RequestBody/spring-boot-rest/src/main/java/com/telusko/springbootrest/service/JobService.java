package com.telusko.springbootrest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.telusko.springbootrest.model.JobPost;
import com.telusko.springbootrest.repo.JobRepo;


@Service
public class JobService {
	@Autowired
	public JobRepo repo;
	
	
	
	//method to return all JobPosts
	public List<JobPost> getAllJobs() {
		return repo.getAllJobs();

		
	}
	
	
	
	

	// ***************************************************************************


	
	
	
	// method to add a jobPost
	public void addJob(JobPost jobPost) {
		 repo.addJob(jobPost);
	
	}





	public JobPost getJob(int postId) {
		
		return repo.getJob(postId);
	}

	
}
