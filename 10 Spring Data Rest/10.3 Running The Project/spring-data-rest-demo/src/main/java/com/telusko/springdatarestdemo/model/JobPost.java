package com.telusko.springdatarestdemo.model;


import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class JobPost {

@Id
	private int postId;
	private String postProfile; 
	private String postDesc;
	private Integer reqExperience;
	private List<String> postTechStack;
	

}
