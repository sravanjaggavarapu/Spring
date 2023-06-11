package com.pack.javbased;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new AnnotationConfigApplicationContext(VegConfig.class,NonVegConfig.class,PartyConfig.class);
    	
    	Party party = context.getBean("party",Party.class);
    	party.partyInfo();
    	
    	Vegetarian vegetarian = context.getBean("vegetarian",Vegetarian.class);
    	vegetarian.vegInfo();
    	
    	Nonvegetarian nonvegetarian = context.getBean("nonVegetarian",Nonvegetarian.class);
    	nonvegetarian.nonVegInfo();
    }
}
