package com.telusko;

import java.beans.ConstructorProperties;

public class Alien {
	
	private int age;
	private Computer comp;
	
	public Alien() {
		System.out.println("Object Created");
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
		System.out.println("Setter called");
		this.age = age;
	}
	
	public Computer getComp() {
		return comp;
	}
	
	public void setComp(Computer comp) {
		this.comp = comp;
	}
	
	public void code() {
		System.out.println("Coding");
		comp.compile();
	}
	
}
