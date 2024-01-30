package com.telusko;

public class Desktop implements Computer {

	public  Desktop() {
		System.out.println("Desktop  Objected Created");
	}
	@Override
	public void compile() {
		System.out.println("Compiling using Desktop");
	}
}
