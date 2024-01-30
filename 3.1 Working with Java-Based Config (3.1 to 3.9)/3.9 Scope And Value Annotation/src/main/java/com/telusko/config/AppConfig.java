package com.telusko.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.telusko")
public class AppConfig {

	
	
//	
//	@Bean
//	public Alien alien(Computer com) //@Qualifier("desktop")
//	{
//		Alien obj= new Alien();
//		obj.setAge(25);
//		obj.setCom(com);
//		return obj;
//		
//	}
//	
//	
//	
//	@Bean
//	@Primary
//	public Laptop laptop() {
//		return new Laptop();
//	}
//	
//	
//	
//	
////	@Bean(name = {"Beast","desktop","com1"})
//	
//	@Bean
//	//@Scope("prototype")
//	public Desktop desktop() {
//		return new Desktop();
//	}
}
