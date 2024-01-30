package com.telusko;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
//("com2")
@Component
@Primary
public class Desktop implements Computer {

	public  Desktop() {
		System.out.println("Desktop  Object Created");
	}
	@Override
	public void compile() {
		System.out.println("Compiling using Desktop");
	}
}
