package com.isaiev.spring.annotation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Transporter implements Car{
	
	@Autowired
	private List <Car> carsToTrasport;
	
	Transporter(){}
	
	public Transporter (List <Car> cars) {
		this.carsToTrasport=cars;
	}

	public void run() {
		System.out.println("Transporter started and going to transport "+carsToTrasport.size()+" sportcars!");
	}
	
	public String getModel(){
		return "Transporter";
	}

}
