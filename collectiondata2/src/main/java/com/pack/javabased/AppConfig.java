package com.pack.javabased;

import java.util.List;
import java.util.Set;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
	@Bean
	public Book book1() {
		Book book = new Book();
		book.setBookId(100);
		book.setBookName("Wings of Fire");
		book.setBookAuthor("A.P.J Abdul Kalam");
		return book;
	}
	@Bean
	public Book book2() {
		Book book = new Book();
		book.setBookId(101);
		book.setBookName("Fire");
		book.setBookAuthor("RamaRaju");
		return book;
	}
	@Bean
	public Customer customer1() {
		Customer customer = new Customer();
		customer.setCustomerId(200);
		customer.setCustomerFname("sravan");
		customer.setCustomerLname("kumar");
		customer.setCustomerEmail("sravan2001@gmail.com");
		return customer;
	}
	@Bean
	public Customer customer2() {
		Customer customer = new Customer();
		customer.setCustomerId(201);
		customer.setCustomerFname("praveen");
		customer.setCustomerLname("kumar");
		customer.setCustomerEmail("praveen2000@gmail.com");
		return customer;
	}
	@Bean
	public CollectionData collectionData() {
		CollectionData data = new CollectionData();
		data.setBook(List.of(book1(), book2()));
		data.setCustomer(Set.of(customer1(), customer2()));
		return data;
	}

}
