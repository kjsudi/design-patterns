package com.kjsudi.java.designpatterns.factory;

public class CarTest {
	
	public static void main(String[] args) {
	
		CarFactory carFactory = new CarFactory();
		Car car = carFactory.getCar(6,Color.PANTHER_BLACK);
		if(car!=null) {
			car.drive();
		}
		else {
			System.out.println("No car found");
		}
		
	}

}
