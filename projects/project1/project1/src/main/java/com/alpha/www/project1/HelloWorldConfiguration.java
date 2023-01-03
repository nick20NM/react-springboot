package com.alpha.www.project1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// JDK 16
record Person(String name, int age) {};

record Address(String city, String state) {};

@Configuration
public class HelloWorldConfiguration {
	
	@Bean
	public String name() {
		return "Tom";
	}
	
	@Bean
	public int age() {
		return 20;  
	}
	
	@Bean
	public Person person() {
		return new Person("jerry", 15);
	}
	
	@Bean
	public Address address() {
		return new Address("kharsia", "chhattisgarh");
	}
}
