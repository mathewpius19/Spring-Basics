package com.kpmg.springDemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.context.support.XmlWebApplicationContext;

public class SetterDemoApp {

	public static void main(String[] args) {
		
		//load the spring context container
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrieve the bean in the container
		CricketCoach myCoach = context.getBean("myCricketCoach", CricketCoach.class);
		
		//call the methods in the bean
		System.out.println(myCoach.getDailyWorkout());
		System.out.println(myCoach.getDailyFortune());
		
		//calling the methods with the literal values
		
		System.out.println(myCoach.getTeam());
		System.out.println(myCoach.getEmailId());
		//close the context
		context.close();

	}

}
