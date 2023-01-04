package com.alpha.www.project1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// JDK 16
record Person(String name, int age, Address address) {};

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
		return new Person("jerry", 15, new Address("bilaspur", "chhattisgarh"));
	}
	
	@Bean
	public Person person2() {
		return new Person(name(), age(), address());
	}
	
	@Bean
	public Person person3(String name, int age, Address address3) {
		return new Person(name, age, address3);
	}
	
	@Bean(name = "address2")
	public Address address() {
		return new Address("kharsia", "chhattisgarh");
	}
	
	@Bean(name = "address3")
	public Address address2() {
		return new Address("raipur", "chhattisgarh");
	}
}
