package com.isaiev.spring.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("SpringBeans.xml");
        Driver driver = (Driver)context.getBean("bmwDriver");
        driver.driveCar();
        System.out.println("");
        Driver transporterDriver = (Driver)context.getBean("transporterDriver");
        transporterDriver.driveCar();
    }
}
