package com.example.ddns;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.base.BaseDriver;
import com.dd.pageobjects.FindDentist;
import com.dd.pageobjects.HomePage;
import com.dd.pageobjects.SearchResults;
import com.support.SeleniumUtils;

public class SearchDentist extends BaseDriver {

	private WebDriver driver = getDriver();
	SeleniumUtils utils = new SeleniumUtils();
	WebElement elem = null;


	public void findDoctor() {

		// Click on find Doctor link from home page
		driver.findElement(HomePage.FIND_DOCTOR_LINK).click();
	}

	public void selectZipAndProvider(int zipCode, String provider) {


		// enter zip code as 94105 from search doctor page
		driver.findElement(FindDentist.ZIP_CODE).sendKeys(String.valueOf(zipCode));

		// get dropdown element
		elem = driver.findElement(FindDentist.DROP_DOWN);

		// Select element by Visible Text
		utils.selectByVisibleText(elem, provider);

		// Click on search button
		driver.findElement(FindDentist.SEARCH_BTN).click();

	}

	public void searchProviderFromSearchPage(String provider) {

		// enter western dental as input search text in search results page
		driver.findElement(SearchResults.SEARCH_INPUT).sendKeys(provider);

		// click on search button
		driver.findElement(SearchResults.SEARCH_RESULTS_SEARCH_BTN).click();

	}
}
