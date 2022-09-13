package com.kpmg.springDemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		
		//load spring config file
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean-scope-applicationContext.xml");
		
		//retrieve bean object from container
		
		Coach theCoach = context.getBean("myCoach",Coach.class);
		
		Coach alphaCoach = context.getBean("myCoach", Coach.class);
		
		Boolean result = (theCoach==alphaCoach);
		System.out.println(result+  " " + theCoach + " "+ alphaCoach);
	}

}
