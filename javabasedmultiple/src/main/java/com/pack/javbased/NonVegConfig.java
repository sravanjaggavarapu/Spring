package com.pack.javbased;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class NonVegConfig {
	@Bean
	public Nonvegetarian nonVegetarian() {
		return new Nonvegetarian();
	}

}
