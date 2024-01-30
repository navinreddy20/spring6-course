package com.telusko.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.telusko.Alien;
import com.telusko.Computer;
import com.telusko.Desktop;

@Configuration
public class AppConfig {

	
	
	@Bean
	public Alien alien(Computer com) {
		Alien obj= new Alien();
		obj.setAge(25);
		obj.setCom(com);
		return obj;
		
	}
	
	
	
	
	
	
	
	
//	@Bean(name = {"Beast","desktop","com1"})
	
	@Bean
	//@Scope("prototype")
	public Desktop desktop() {
		return new Desktop();
	}
}
