package com.isaiev.spring.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class SportCarDriver implements Driver{
	
	@Autowired
	@Qualifier("sportCarBMW")
	private SportCar car;
	
	SportCarDriver(){}
	
	SportCarDriver (SportCar car){
		this.car = car;
	}

	public SportCar getCar() {
		return car;
	}
	
	
	public void setCar(SportCar car) {
		this.car = car;
	}

	public void driveCar() {
		System.out.println("I am driving "+car.getModel());
		
	}
	
	

}
