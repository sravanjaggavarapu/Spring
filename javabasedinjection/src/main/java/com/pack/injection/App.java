package com.pack.injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		Emp emp = context.getBean("emp", Emp.class);
		System.out.println(emp);

		Address address = context.getBean("address", Address.class);
		System.out.println(address);

		Experience exp = context.getBean("experience", Experience.class);
		System.out.println(exp);
	}
}
