package com.pack.injection;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
	@Bean
	public Address address() {
		return new Address("vishwas street", "Vijayawada", "AndhraPradesh");
	}
	@Bean
	public Experience experience() {
		return new Experience(2, 6);	
	}
	@Bean
	public Emp emp() {
		return new Emp(111, "sravan", 3456789.09, address(), experience());
	
	}

}
