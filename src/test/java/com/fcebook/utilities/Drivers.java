package com.fcebook.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Drivers {

	static private WebDriver driver;
	public static WebDriver getDriver() {
		if(driver == null) {

		switch (Config.getProperty("browserType")) {
		case "chrome":
			System.setProperty("webdriver.chrome.driver", "C:/Users/derya/OneDrive/Belgeler/kütüphane/drivers/chromedriver.exe");
			driver = new ChromeDriver();
			break;
		case "firefox":
			System.setProperty("webdriver.gecko.driver", "C:/Users/derya/OneDrive/Belgeler/kütüphane/drivers/chromedriver.exe");
			driver = new FirefoxDriver();
			break;
		case "safari":
			driver = new SafariDriver();
			break;
		}
		}
		return driver;
	
	}
	
	
	
	
	
}
