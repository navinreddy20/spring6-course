package com.telusko;

import java.beans.ConstructorProperties;

public class Alien {
	
	private int age;
	//private Laptop lap = new Laptop();
	private Laptop lap;
	private int salary;
	
	public Alien() {
		System.out.println("Object Created");
	}
	
	@ConstructorProperties({"age","lap"})
	public Alien(int age,Laptop lap) {
		System.out.println("Para Constructor Called");
		this.age = age;
		this.lap = lap;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {    // Setter Injection
		System.out.println("Setter called");
		this.age = age;
	}
	
	public Laptop getLap() {
		return lap;
	}
	
	public void setLap(Laptop lap) {
		this.lap = lap;
	}
	
	public void code() {
		System.out.println("Coding");
		lap.compile();
	}
	
}
