package com.telusko.springsecdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping("hello")
	public String greet() {
		return "Hello World";
	}
}
