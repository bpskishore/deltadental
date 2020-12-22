package com.dd.pageobjects;

import org.openqa.selenium.By;

import com.dd.pagelocators.SearchResultsLocator;

public class SearchResults {
	
	public static final By SEARCH_INPUT = By.ByXPath.cssSelector(SearchResultsLocator.SEARCH_INPUT);
	public static final By SEARCH_RESULTS_SEARCH_BTN = By.ByXPath.cssSelector(SearchResultsLocator.SEARCH_RESULTS_BTN);

}
