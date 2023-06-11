package com.pack.javbased;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
public class Student {
	@Value("8080")
	int port;

	public Student() {
		System.out.println("Student :: Constructor");
	}
	public void stuInfo() {
		System.out.println("Students are Studying & port is : "+port);
	}

}
