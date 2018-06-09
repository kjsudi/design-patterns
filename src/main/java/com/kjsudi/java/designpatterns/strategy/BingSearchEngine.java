package com.kjsudi.java.designpatterns.strategy;

public class BingSearchEngine implements ISearchEngine {
	
	public BingSearchEngine() {
		System.out.println("Using Bing search engine");
	}

	public String searchFor(String userInput) {
		String output = "We found: <Response from Bing> for your input: " + userInput; 
		return output;
	}
	

}
