package com.telusko.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.telusko.Alien;
import com.telusko.Computer;
import com.telusko.Desktop;
import com.telusko.Laptop;

@Configuration
public class AppConfig {

	
	
	@Bean
	public Alien alien(Computer com) //@Qualifier("desktop")
	{
		Alien obj= new Alien();
		obj.setAge(25);
		obj.setCom(com);
		return obj;
		
	}
	
	
	
	@Bean
	@Primary
	public Laptop laptop() {
		return new Laptop();
	}
	
	
	
	
//	@Bean(name = {"Beast","desktop","com1"})
	
	@Bean
	//@Scope("prototype")
	public Desktop desktop() {
		return new Desktop();
	}
}
