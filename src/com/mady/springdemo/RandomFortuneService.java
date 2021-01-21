package com.mady.springdemo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {
	private Random myRandom=new Random();

	//create an array of Strings
	private String data[]= {
			"My name is Mady",
			"This is from random service",
			"You are nice"
	};
	
	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		return data[myRandom.nextInt(data.length)];
	}

}
