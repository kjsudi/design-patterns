package com.kjsudi.java.designpatterns.strategy;

public enum Mode {

	ADV("Advanced"), NORMAL("Normal");

	Mode(String name) {
		this.name = name;
	}

	private String name;

	public String getName() {
		return this.name;
	}

}
