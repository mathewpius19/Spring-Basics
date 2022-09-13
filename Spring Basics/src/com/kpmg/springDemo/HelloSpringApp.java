package com.kpmg.springDemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		// load the spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		//retireve bean from spring container
		Coach theCoach = context.getBean("myCoach", Coach.class);

		//call methods on bean
		System.out.println(theCoach.getDailyWorkout());
		
		//lets call the getFortune method to check constructor injection
		
		System.out.println(theCoach.getDailyFortune());
		
		
		
		// close the context
		context.close();
		
		
		
	}
}
