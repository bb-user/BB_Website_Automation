package com.betabreakers.PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage{

	public HomePage(WebDriver driver) {
		super(driver);
		//super.navigateTo("http://www.betabreakers.com");
	}

	public ServicesPage clickWhatsYourNextProject() {
		driver.findElement(By.cssSelector("#slidewrap > div > div > a")).click();
		return new ServicesPage(driver);
	}

}
