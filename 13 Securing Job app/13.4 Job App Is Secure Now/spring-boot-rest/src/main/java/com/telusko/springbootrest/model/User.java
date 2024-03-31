package com.telusko.springbootrest.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;


@Data
@Table(name = "users")
@Entity
public class User {
	
@Id
	private int id;
	private String username;
	private String password;
	
}
