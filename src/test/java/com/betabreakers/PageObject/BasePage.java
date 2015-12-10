package com.betabreakers.PageObject;

import org.openqa.selenium.WebDriver;

public class BasePage {


	protected WebDriver driver;

	public BasePage(WebDriver driver) {
		this.driver = driver;
	}

	public HomePage navigateToHomePage() {
		driver.navigate().to("http://www.betabreakers.com");

		return new HomePage(driver);
	}

	public ServicesPage navigateToServicesPage() {
		driver.navigate().to("http://www.betabreakers.com/services");

		return new ServicesPage(driver);
	}

	public void quitDriver() {
		driver.quit();
	}



}
