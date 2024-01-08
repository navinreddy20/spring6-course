package com.telusko;

public class Alien {
	
	private int age;
	//private Laptop lap = new Laptop();
	private Laptop lap;
	
	public Alien() {
		System.out.println("Object Created");
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
