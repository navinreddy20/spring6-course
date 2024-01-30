package com.telusko.app.service;

import org.springframework.stereotype.Service;

import com.telusko.app.model.Laptop;

@Service
public class LaptopService {

	public void add(Laptop laptop) {
		System.out.println("method called");
		
	}

	public boolean isGoodForProg(Laptop lap) {
		return true;
	}
	
}
