package com.kjsudi.java.designpatterns.factory;

public class Sedan extends Car {

	public Sedan(Color color) {
		super(color);
	}
	
	@Override
	public void drive() {
		System.out.println("Zooming my " + this.getColor().name() + " sedan");
	}


}
