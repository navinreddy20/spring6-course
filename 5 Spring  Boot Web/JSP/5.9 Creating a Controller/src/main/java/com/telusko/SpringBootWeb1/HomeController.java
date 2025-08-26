package com.telusko.SpringBootWeb1;

import org.springframework.stereotype.Controller;

@Controller
public class HomeController {
	
	public String home() {
		System.out.println("Home method called");
		return "index.jsp";
	}

}
