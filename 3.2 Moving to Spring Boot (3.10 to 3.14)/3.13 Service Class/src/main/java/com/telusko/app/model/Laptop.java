package com.telusko.app.model;

import org.springframework.stereotype.Component;

@Component
public class Laptop implements Computer{

	
	public void compile() {
		
		System.out.println("Compiling in Laptop");
	}

}
