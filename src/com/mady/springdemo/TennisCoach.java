package com.mady.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {
	
	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;
	
	//define a default constructor
	public TennisCoach() {
		System.out.println(">> TennisCoach: Inside a default contructor");
	}
	
	//define my init method
	@PostConstruct
	public void doMyStartupStuff() {
		System.out.println("Pre Initialize process");
	}
	
	//define my destroy method
	@PreDestroy
	public void doMyCleanupStuff() {
		System.out.println("Pre CLeanning process");
	}
	
	
	//define setter method
	/*@Autowired
	public void setFortuneService(FortuneService theFortuneService) {
		System.out.println(">> tennisCoach: Inside a setter setFortuneService() method");
		fortuneService=theFortuneService;
	}
	
	@Autowired
	public TennisCoach(FortuneService theFortuneService) {
		fortuneService=theFortuneService;
	}*/
 
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Practice your daily backhand valley";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
