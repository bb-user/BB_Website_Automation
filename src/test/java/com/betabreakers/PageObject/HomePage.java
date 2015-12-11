package com.betabreakers.PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage{

	public HomePage(WebDriver driver) {
		super(driver);
	}

	public ServicesPage whatsYourNextProject() {
		driver.findElement(By.cssSelector("#slidewrap > div > div > a")).click();

		return new ServicesPage(driver);
	}

}
