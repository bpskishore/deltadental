package com.support;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class SeleniumUtils {
	
	public void waitForVisibilityOfElementByClassName(WebDriver driver, String str) {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated((By.className(str))));
	}

	public void selectByVisibleText(WebElement elem, String text) {
		
		Select sel = new Select(elem);
		sel.selectByVisibleText(text);
	}
	
	public void selectByIndex(WebElement elem, int index) {
		
		Select sel = new Select(elem);
		sel.selectByIndex(index);
	}
	
	public void selectByValue(WebElement elem, String val) {
		
		Select sel = new Select(elem);
		sel.selectByValue(val);
	}
	
	public void checkOverlayAndClick(WebDriver driver, WebElement element) {
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", element);
	}

}
