package com.kpmg.springDemo;

public class CricketCoach implements Coach {

	private FortuneService fortuneService;
	
	//Create fields to add literal values
	
	private String emailId;
	private String team;
	
	//create a non arg constructor
	
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getTeam() {
		return team;
	}
	public void setTeam(String team) {
		this.team = team;
	}
	public CricketCoach() {
		System.out.println("call for no arg constructor in cricketCoach");
	}
	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Add 5mins of bowling practice everyday for a week";
	}
	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return "Ind vs Pak is today" + fortuneService.getFortune();
	}

}
