package com.telusko;

public class Desktop implements Computer {

	@Override
	public void compile() {
		System.out.println("Compiling using Desktop");
	}
}
