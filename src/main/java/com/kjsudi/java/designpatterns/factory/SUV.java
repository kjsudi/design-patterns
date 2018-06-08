package com.kjsudi.java.designpatterns.factory;

public class SUV extends Car {

	public SUV(Color color) {
		super(color);
	}
	
	@Override
	public void drive() {
		System.out.println("Offroading my " + this.getColor().name() + " SUV");
	}
}
