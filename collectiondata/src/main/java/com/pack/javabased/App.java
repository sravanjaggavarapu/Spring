package com.pack.javabased;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	@SuppressWarnings("resource")
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
    	CollectionData data = context.getBean("collectionData",CollectionData.class);
    	data.getNames().forEach(names->System.out.println(names));
    	data.getPincodes().forEach(pincodes->System.out.println(pincodes));
    	data.getWordcount().forEach((k,v)->System.out.println(k+" "+v));
    }
}
