package com.alpha.www.project1.helloworld;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HelloWorldSpring {

	public static void main(String[] args) {
		// 1) launch a spring context
		try (var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class)) {
			// 2) configure the things that we want spring to manage -
			// HelloWorldConfiguration - @Congiguration
			// name - @Beab

			// 3) retrieving beans managed by spring
			System.out.println(context.getBean("name"));
			System.out.println(context.getBean("age"));
			System.out.println(context.getBean("person"));
			System.out.println(context.getBean("person2"));
			System.out.println(context.getBean("person3"));
			System.out.println(context.getBean("address2"));
			System.out.println(context.getBean(Person.class));
			System.out.println(context.getBean(Address.class));
			System.out.println(context.getBean("person5"));
//			Arrays.stream(context.getBeanDefinitionNames())
//				  .forEach(System.out::println);
		}
	}

}
