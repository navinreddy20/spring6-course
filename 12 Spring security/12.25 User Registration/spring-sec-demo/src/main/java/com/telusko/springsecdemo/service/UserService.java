package com.telusko.springsecdemo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.telusko.springsecdemo.dao.UserRepo;
import com.telusko.springsecdemo.model.User;

@Service
public class UserService {
@Autowired
	private UserRepo repo;
	
	public User saveUser(User user) {
	return repo.save(user) ;
		
	}
}
