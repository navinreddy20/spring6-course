package com.telusko;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        
    	ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");  // create a container
//    	Alien obj = new Alien();
    	Alien obj = (Alien) context.getBean("alien");
    	obj.code();
    	
    }
}
