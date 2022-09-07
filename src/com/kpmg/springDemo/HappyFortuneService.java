package com.kpmg.springDemo;

public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		String [] fortunes={"Today is your lucky day", "Today might be tricky", "Lets find out what happens today", "bad day at the office","nothing can beat you today"};
		Integer max = fortunes.length;
		Integer fortune = (int) (Math.random()*max);
		return fortunes[fortune];
	}

}
