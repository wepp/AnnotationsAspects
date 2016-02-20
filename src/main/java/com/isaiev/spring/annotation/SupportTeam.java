package com.isaiev.spring.annotation;

import org.aspectj.lang.ProceedingJoinPoint;

public class SupportTeam {
	public void rollCarToTrack(){
		System.out.println("Support team take rolled car to the track!");
	}
	
	public void rollCarToGarage(){
		System.out.println("Support team rolled car to the garage!");
	}
	
	public void repeirCar(){
		System.out.println("Support team have to repeir car :(");
	}
	
	public void getTrackTime(ProceedingJoinPoint joinpoint){
		try{
			System.out.println("Pilot started!");
			long start = System.currentTimeMillis();
	
			joinpoint.proceed();
	
			long end = System.currentTimeMillis();
			System.out.println("Pilot finished!");
			System.out.println("Track time: "+ (end-start) +" milliseconds.");
		}catch(Throwable t){
			System.out.println("Support team have to repeir car :(");
		}
	}

}
