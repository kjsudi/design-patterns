package com.kjsudi.java.designpatterns.strategy;

public interface ISearchEngine {
	
	public String getName();
	public String searchFor(String userInput);
	public void setAdvancedMode();
	
}
