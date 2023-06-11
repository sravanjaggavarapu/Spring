package com.pack.javabased;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(Javaconfig.class);
		Food f1 = context.getBean("food", Food.class);
		f1.foodInfo();
		Fruits fruits = context.getBean("fr", Fruits.class);
		fruits.fruitsInfo();
		Drinks drinks = context.getBean("d1", Drinks.class);
		drinks.drinkInfo();
	}
}
