package com.pack.javabased;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {
	@Bean(name = {"e"}, initMethod = "init", destroyMethod = "destroy")
	@Scope(scopeName = "prototype")
	public Emp emp() {
		return new Emp();
	}

}
