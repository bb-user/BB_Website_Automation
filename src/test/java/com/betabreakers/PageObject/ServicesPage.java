package com.betabreakers.PageObject;

import org.openqa.selenium.WebDriver;

public class ServicesPage extends BasePage{

	public ServicesPage(WebDriver driver) {
		super(driver);

	}

	public String getPageTitle() {
		return driver.getTitle();
	}

}
