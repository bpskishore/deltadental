package com.base;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class BaseDriver {

	private WebDriver driver=null;

	public WebDriver getDriver() {
		setDriver(driver);
		return driver;
	}

	private void setDriver(WebDriver driver) {
		
		if(driver == null) {
			System.setProperty("webdriver.chrome.driver", "chromedriver/chromedriver");
			ChromeOptions options = new ChromeOptions();
			DesiredCapabilities capabilities = new DesiredCapabilities();
			capabilities.setCapability(ChromeOptions.CAPABILITY, options);
			this.driver = new ChromeDriver(capabilities);
			this.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			this.driver.get("https://www.deltadental.com/");
		}
	}
	
	public void quitDriver() {
		if(getDriver() != null) {
			getDriver().quit();
			driver=null;
		}
	}
}
