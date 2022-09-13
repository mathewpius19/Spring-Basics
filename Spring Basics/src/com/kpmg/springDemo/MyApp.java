package com.kpmg.springDemo;

public class MyApp {

	public static void main(String[] args) {
		Coach c = new BaseballCoach();
		System.out.println(c.getDailyWorkout());
	}
}
