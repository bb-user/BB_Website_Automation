package com.betabreakers.PageObject;

import org.openqa.selenium.WebDriver;

public class BasePage {


	protected WebDriver driver;

	public BasePage(WebDriver driver) {
		this.driver = driver;
	}

	public HomePage navigateToHomePage() {
		driver.manage().window().maximize();
		driver.navigate().to("http://www.betabreakers.com");

		return new HomePage(driver);
	}

	public void quitDriver() {
		driver.quit();
	}



}
