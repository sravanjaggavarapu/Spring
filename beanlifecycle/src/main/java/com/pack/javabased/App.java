package com.pack.javabased;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
    	Emp e1 = context.getBean("e",Emp.class);
    	e1.empInfo();
    	System.out.println(e1);
    	
    	Emp e2 = context.getBean("e",Emp.class);
    	e2.empInfo();
    	System.out.println(e2);
    }
}
