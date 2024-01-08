package com.telusko;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        
    	ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");  // create a container
//    	Alien obj = (Alien) context.getBean("alien");
    	Alien obj1 = (Alien) context.getBean("alien1");
    	obj1.code();
    	
    	Alien obj2 = (Alien) context.getBean("alien1");
    	obj2.code();
    	
    }
}
