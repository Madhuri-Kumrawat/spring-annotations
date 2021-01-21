package com.mady.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanSopeDemoApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");	
		
		//retrive bean from container
		Coach theCoach=context.getBean("tennisCoach",Coach.class);
		
		Coach alphaCoach=context.getBean("tennisCoach",Coach.class);

	}

}
