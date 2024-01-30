package com.telusko.JobApp.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.telusko.JobApp.model.JobPost;
import com.telusko.JobApp.service.JobService;

@Controller
public class JobController {

	@Autowired
	private JobService service;

	// ************************************************************************

	@RequestMapping({"/","/home"})
	public String home() {
		return "home";
	}

	// ************************************************************************

	@RequestMapping("/addjob")
	public String addJob() {
		return "addjob";
	}

	// ************************************************************************

	// controller method for getting all job posts
	@GetMapping("/viewalljobs")
	public String viewJobs(Model model) {

		List<JobPost> jobPosts = service.returnAllJobPosts();
		model.addAttribute("jobPosts", jobPosts);
		return "viewalljobs";
	}
	
	// ************************************************************************

	@PostMapping("/handleForm")
	public String handleAddJobForm(JobPost jobPost,Model model) {
		model.addAttribute("jobPost", jobPost);
		service.addJobPost(jobPost);
		//System.out.println(jobPost);
		  return "success";
		
	}
	


	
	
	
	
	
	
	
	
	
	
}
