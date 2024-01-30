package com.telusko.springbootrest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.telusko.springbootrest.model.JobPost;
import com.telusko.springbootrest.service.JobService;

@RestController	
public class JobRestController {
	
	@Autowired
	private JobService service;
	
	
	@GetMapping("jobPosts")
	public List<JobPost> getAllJobs() {
		return service.getAllJobs();
		
	}

}
