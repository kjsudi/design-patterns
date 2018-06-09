package com.kjsudi.java.designpatterns.strategy;

public class GoogleSearchEngine implements ISearchEngine {
	
	public GoogleSearchEngine() {
		System.out.println("Using Google search engine");
	}

	public String searchFor(String userInput) {
		String output = "We found: <Response from Google> for your input: " + userInput; 
		return output;
	}
	

}
