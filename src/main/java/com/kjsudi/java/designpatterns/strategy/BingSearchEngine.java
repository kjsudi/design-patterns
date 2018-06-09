package com.kjsudi.java.designpatterns.strategy;

public class BingSearchEngine implements ISearchEngine {
	
	private String name;
	private Mode mode;
	
	public BingSearchEngine(String name) {
		setNameAndMode(name);
	}
	
	public String searchFor(String userInput) {
		
		System.out.println("Using " + getName() +  " search engine in " + this.mode.getName() + " mode");
		
		String output;
		if(this.mode == Mode.ADV) {
		 output = "We found: <Complex processed response> for your input: " + userInput;
		}
		else {
			output = "We found: <Response> for your input: " + userInput;
		}
		return output;
	}

	private void setNameAndMode(String name) {
		this.name = "[" + name  + "]";
		this.mode = Mode.NORMAL;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setAdvancedMode() {
		this.mode = Mode.ADV;
	}
	

}
