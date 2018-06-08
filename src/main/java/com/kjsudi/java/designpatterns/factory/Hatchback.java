package com.kjsudi.java.designpatterns.factory;

public class Hatchback extends Car {

	public Hatchback(Color color) {
		super(color);
	}

	@Override
	public void drive() {
		System.out.println("Zipping in traffic in my " + this.getColor().name() + " hatchback");
	}

}
