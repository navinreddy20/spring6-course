package com.telusko.SpringBootWeb1;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
public class HomeController {
	
	@RequestMapping("/")
	public String home() {
		//System.out.println("Home method called");
		return "index.jsp";
	}
	
	@RequestMapping("add")
	public String add(@RequestParam("num1") int num1,@RequestParam("num2") int num2,HttpSession session) {
		

int result=num1+num2;
	session.setAttribute("result", result);

		return "result.jsp";
	}

}
