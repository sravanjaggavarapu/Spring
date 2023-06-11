package com.pack.javabased;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

	@Bean
	public CollectionData collectionData() {
		CollectionData data = new CollectionData();
		data.setNames(List.of("sravan","praveen","sai","pramod"));
		data.setPincodes(Set.of(345678,521228,534213,897654,546789));
		data.setWordcount(Map.of("sravan",10,"dheeraj",89,"siva",78));
		return data;
	}
}
