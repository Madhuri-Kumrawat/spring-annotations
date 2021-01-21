package com.mady.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SwimJavaConfigDemoApp {

	public static void main(String[] args) {
		// read Spring config java class 
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(SportConfig.class);	
		
		//get the bean from spring container
		SwimCoach theCoach=context.getBean("swimCoachBean",SwimCoach.class);
		
		//call a method on a bean
		System.out.println(theCoach.getDailyWorkout());

		//call a method on a bean
		System.out.println(theCoach.getDailyFortune());
				
		//call getter method of swim coach class
		System.out.println("email: "+theCoach.getEmail());		
		System.out.println("team: "+theCoach.getTeam());
		
		//close the context
		context.close();
	}

}
