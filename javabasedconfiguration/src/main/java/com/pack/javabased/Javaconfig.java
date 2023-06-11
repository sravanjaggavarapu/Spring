package com.pack.javabased;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Javaconfig {

	@Bean
	public Food food() {
		return new Food();
	}

	@Bean(name = {"fr"})
	public Fruits fruits() {
		return new Fruits();
	}

	@Bean(name = { "d1", "d2", "d3" })
	public Drinks drinks() {
		return new Drinks();
	}

}
