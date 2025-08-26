package com.telusko.SpringBootWeb1;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	@ModelAttribute("course")
	public String courseName() {
		return "Java";
	}
	
	
	@RequestMapping("/")
	public String home() {
		// System.out.println("Home method called");
		return "index";
	}

	@RequestMapping("add")
	public ModelAndView add(@RequestParam("num1") int num1, @RequestParam("num2") int num2, ModelAndView mv) {

		int result = num1 + num2;
		mv.addObject("result",result);
		mv.setViewName("result");

		return mv;
	}
	
	

	@RequestMapping("addAlien")
	public String addAlien(Alien alien) {
	//public String addAlien(@ModelAttribute("alien1") Alien alien) {
       
		return "result";
	}

}
