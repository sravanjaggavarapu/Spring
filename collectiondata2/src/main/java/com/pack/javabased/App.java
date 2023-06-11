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
    	data.getBook().forEach(book->System.out.println(book.getBookId()+" "+book.getBookName()+" "+book.getBookAuthor()));
    	data.getCustomer().forEach(customer->System.out.println(customer));
    }
}
