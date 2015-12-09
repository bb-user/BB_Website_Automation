package com.betabreakers.BB_Website_Cuke_Automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.betabreakers.PageObject.HomePage;

public class BasePageStepDefs {
	protected static WebDriver driver;
	protected HomePage homePage;


	BasePageStepDefs(){
		getDriver();
		homePage = new HomePage(driver);
	}

	protected WebDriver getDriver() {
		if(driver == null) {
			driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
		return driver;
	}


}
