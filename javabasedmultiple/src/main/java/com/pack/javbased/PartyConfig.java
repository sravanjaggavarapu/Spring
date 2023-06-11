package com.pack.javbased;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
//@Import({VegConfig.class,NonVegConfig.class})
public class PartyConfig {
	@Bean
	public Party party() {
		return new Party();
	}

}
