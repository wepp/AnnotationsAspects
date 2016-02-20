package com.isaiev.spring.annotation;

public class SportCar implements Car {
	
	private String model = "Lada";
	
	public SportCar(){}
	
	public SportCar(String model){
		this.model=model;
	}
	
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Car "+ model+ " started!");
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	
}
