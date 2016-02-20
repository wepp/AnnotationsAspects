package com.isaiev.spring.annotation;

import org.springframework.beans.factory.annotation.Autowired;

public class TransporterDriver implements Driver {
	
	
	Transporter car;
	
	TransporterDriver(Transporter car){
		this.car = car;
	}
	
	public void driveCar() {
		System.out.println("I am driving "+car.getModel());
		
	}
	
	public Transporter getCar(){return car;}

}
