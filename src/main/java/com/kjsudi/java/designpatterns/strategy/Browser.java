package com.kjsudi.java.designpatterns.strategy;

import lombok.Getter;

/**
 * 
 * @author kjsudi
 * Here, an example of changing the search engine from the default one is shown.
 * 
 */

@Getter
public class Browser {
	
	private String name;
	
	private ISearchEngine searchEngine;
	
	public Browser(String name) {
		setName(name);
		System.out.println("Browser to be used: " + getName());
		setSearchEngine(new GoogleSearchEngine("Google"));
	}
	
	public String searchFor(String input) {
		return this.searchEngine.searchFor(input);
	}
	
	private void setName(String browserName) {
		this.name = "{" + browserName + "}";
	}
	
	public void setSearchEngine(ISearchEngine searchEngine) {
		
		if(this.searchEngine != null) {
			System.out.println("Changing search engine from: "  + this.searchEngine.getName() + " to " + searchEngine.getName());
		}
		else {
			System.out.println("Setting default search engine as: " + searchEngine.getName());
		}
		this.searchEngine = searchEngine;
	}
	
	public static void main(String[] args) {
		
		Browser browser = new Browser("Chrome");
		String searchInput = "How is the weather in Bangalore now?";
		String searchOutput = browser.searchFor(searchInput);
		System.out.println(searchOutput);
		
		// :( Unhappy with the result? Set a new search engine and search for the same input
		
		browser.setSearchEngine(new BingSearchEngine("Bing"));
		searchOutput = browser.searchFor(searchInput);
		System.out.println(searchOutput);
		
		// :( Still Unhappy? Change to advacned mode
		
		browser.setSearchEngine(new GoogleSearchEngine("Google"));
		browser.getSearchEngine().setAdvancedMode();
		searchOutput = browser.searchFor(searchInput);
		System.out.println(searchOutput);
		
		// Maybe Google's output was much better ;)
		
	}

}
