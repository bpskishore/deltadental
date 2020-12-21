package com.example.google;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import com.base.BaseDriver;
import com.support.SeleniumUtils;

public class GoogleSearch extends BaseDriver {

	private WebDriver driver = getDriver();
	SeleniumUtils utils = new SeleniumUtils();
	public void searchText(String txt) {

		utils.waitForVisibilityOfElementByClassName(driver, "notification-close");
		driver.findElement(By.className("notification-close")).click();
		WebElement ele = driver.findElement(By.id("search-query-header-btn"));
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", ele);
		
	}
}
