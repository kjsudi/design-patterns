package com.kjsudi.java.designpatterns.factory;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public abstract class Car {
		
	private Color color;
	
	public abstract void drive();

	
}
