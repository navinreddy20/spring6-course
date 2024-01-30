package com.telusko;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.telusko.config.AppConfig;

public class App {
	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		Alien obj1 = context.getBean(Alien.class);
	   System.out.println(obj1.getAge());
		obj1.code();

		
		
		
		
		
//		Desktop dt = context.getBean("desktop", Desktop.class);
//		dt.compile();
//
//		Desktop dt1 = context.getBean("desktop", Desktop.class);
//		dt1.compile();

		
		
		
		
		
		
		
		
		
//    	ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");  // create a container
//    	Alien obj1 = context.getBean("alien1",Alien.class);
////    	obj1.setAge(21);
//    	System.out.println(obj1.getAge());
//    	
//    	obj1.code();
////    	
////    	Alien obj2 = (Alien) context.getBean("alien1");
////    	System.out.println(obj2.age);
////    	//obj2.code();
//   
//    	
// 
////        Computer com=	context.getBean( Computer.class);
//    	
//    	
// 
////    	Desktop obj=(Desktop)context.getBean("com2",Desktop.class);
////	 Desktop obj= context.getBean( Desktop.class);
	}
}
