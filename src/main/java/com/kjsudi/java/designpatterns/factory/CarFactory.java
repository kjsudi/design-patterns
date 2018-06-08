package com.kjsudi.java.designpatterns.factory;

/**
 * The car factory creates different cars based on input price
 * @author kjsudi
 *
 */
public class CarFactory {
	
	
	public Car getCar(Integer price,Color color) {
		
		if(price > 5 && price < 8) {
			return new Hatchback(color);
		}
		
		else if(price > 8 && price < 15) {
			return new Sedan(color);
		}
		
		else if(price > 15) {
			return new SUV(color);
		}
		
		return null;
	}
}
