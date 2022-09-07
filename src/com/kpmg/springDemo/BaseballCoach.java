package com.kpmg.springDemo;

public class BaseballCoach implements Coach{

	//Define private field for dependency
	private FortuneService fortuneService;
	
	public BaseballCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	public String getDailyWorkout() {
		return "Spend 30 mins in batting practice";
	}

	@Override
	public String getDailyFortune() {

		//use my fortune to get a fortune
		return fortuneService.getFortune();
	}
}
