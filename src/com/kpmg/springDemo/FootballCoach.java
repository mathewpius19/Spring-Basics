package com.kpmg.springDemo;

public class FootballCoach implements Coach{

	private FortuneService fortuneService;
	
	
	public FootballCoach(FortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}

	public String getDailyWorkout() {
		return "run 10 rounds around the field";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return "Champions league week has returned."+ fortuneService.getFortune();
	}
	
	//add init method
	
	public void doMyStartupStuff() {
		System.out.println("Doing startup stuff");
	}
	
	//add destroy method
	public void doMyCleanupStuff() {
		System.out.println("Doing cleanup stuff");
	}
}
