package com.support;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.base.BaseDriver;

public class SeleniumUtils extends BaseDriver{
	
	public void waitForVisibilityOfElementByClassName(WebDriver driver, String str) {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated((By.className(str))));
	}

}
