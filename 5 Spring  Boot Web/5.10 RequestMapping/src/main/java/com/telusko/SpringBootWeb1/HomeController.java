package com.telusko.SpringBootWeb1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping("/")
	public String home() {
		System.out.println("Home method called");
		return "index.jsp";
	}

}
