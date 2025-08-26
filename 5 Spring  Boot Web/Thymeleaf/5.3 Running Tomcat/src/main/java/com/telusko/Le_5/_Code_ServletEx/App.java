package com.telusko.Le_5._Code_ServletEx;

import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;

public class App 
{
    public static void main( String[] args ) throws LifecycleException
    {
        System.out.println( "Hello World!" );
        Tomcat tomcat=new Tomcat();
        tomcat.start();
        tomcat.getServer().await();
    }
}
