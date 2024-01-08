package com.telusko.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootFirstApplication {

    public static void main(String[] args) {

       ApplicationContext context= SpringApplication.run(SpringBootFirstApplication.class, args);

        //we want spring can create that object
        //Alien obj =new Alien();
        //obj.code();

        Alien obj;
        obj=context.getBean(Alien.class);
//        Alien obj1=context.getBean(Alien.class);
        obj.code();
//        obj1.code();

        //Question are we getting two different object or single object
        //this question can answer in upcoming Spring lecture


//        Laptop lap =context.getBean(Laptop.class);
//        lap.compile();
    }

}
