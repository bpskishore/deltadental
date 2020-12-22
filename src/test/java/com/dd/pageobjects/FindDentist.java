package com.dd.pageobjects;

import org.openqa.selenium.By;

import com.dd.pagelocators.SearchDentistLocators;

public class FindDentist {
	
	public static final By ZIP_CODE = By.ByXPath.cssSelector(SearchDentistLocators.ZIP_CODE);
	public static final By DROP_DOWN = By.ByXPath.cssSelector(SearchDentistLocators.DROP_DOWN);
	public static final By SEARCH_BTN = By.ByXPath.cssSelector(SearchDentistLocators.SEARCH_BTN);

}
