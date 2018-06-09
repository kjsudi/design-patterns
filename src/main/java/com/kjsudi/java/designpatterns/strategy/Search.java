package com.kjsudi.java.designpatterns.strategy;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Search {
	
	private ISearchEngine searchEngine;
	
	public Search() {
		this.searchEngine = new GoogleSearchEngine();
	}
	
	public String searchFor(String input) {
		return this.searchEngine.searchFor(input);
	}
	
	public static void main(String[] args) {
		
		Search search = new Search();
		String searchInput = "How is the weather in Bangalore now?";
		String searchOutput = search.searchFor(searchInput);
		System.out.println(searchOutput);
		
		// :( Unhappy with the result? Set a new search engine and search for the same input
		
		search.setSearchEngine(new BingSearchEngine());
		searchOutput = search.searchFor(searchInput);
		System.out.println(searchOutput);
		
		// Maybe Google's output was much better ;)
		
	}

}
