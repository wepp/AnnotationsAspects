package com.isaiev.spring.annotation;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class Dealer {
	
	@Pointcut("execution(* com.isaiev.spring.annotation.TransporterDriver.driveCar(..))")
	public void moving(){}

	@Before("moving()")
	public void carsToTransporter() {
	System.out.println("Roll cars on the transporter");
	}

	@AfterReturning("moving()")
	public void carsFromTransporter() {
	System.out.println("Roll cars from the transporter");
	}

	@AfterThrowing("moving()")
	public void crash() {
	System.out.println("Boo! You crashed our cars!");
	}

}
