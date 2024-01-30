package com.telusko;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Alien {
	
	private int age;
	
	//@Autowired
	//@Qualifier("com2")
	private Computer com;
	
	public Alien() {
		System.out.println("Alien Object Created");
	}
	
//	@ConstructorProperties({"age","lap"})
//	public Alien(int age,Computer lap) {
//		System.out.println("Para Constructor Called");
//		this.age = age;
//		this.lap = lap;
//	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {    // Setter Injection
		//System.out.println("Setter called");
		this.age = age;
	}
	
	public Computer getCom() {
		return com;
	}
	
	
	@Autowired
@Qualifier("laptop")
	public void setCom(Computer com) {
		this.com = com;
	}
	
	public void code() {
		System.out.println("Coding");
		com.compile();
	}
	
}
