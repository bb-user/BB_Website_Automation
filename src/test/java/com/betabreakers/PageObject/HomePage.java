package com.betabreakers.PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {

	public HomePage(WebDriver driver) {
		super(driver);
	}

	public ServicesPage clickWhatsYourNextProject() {
		driver.findElement(By.cssSelector("#slidewrap > div > div > a"))
				.click();
		return new ServicesPage(driver);
	}

	private static String getClient(String client) {
		switch (client) {
		case "cisco":
			return "2";
		case "oracle":
			return "3";
		case "scripps":
			return "4";
		case "leapfrog":
			return "5";
		case "snap on":
			return "6";
		case "trek":
			return "7";
		default:
			return " ";
		}
	}

	public TestimonialsPage clickOnPreviousClient(String client) {
		driver.findElement(
				By.cssSelector("#logoblock > div:nth-child(" + getClient(client)
						+ ") > a > img")).click();
		return new TestimonialsPage(driver);
	}

	public FunctionalTestingPage clickOnFunctionalTestingIcon() {
		driver.findElement(By.cssSelector("#black-studio-tinymce-3 > div > a > img")).click();

		return new FunctionalTestingPage(driver);
	}

	public CompatibilityTestingPage clickOnCompatibilityTestingIcon() {
		driver.findElement(By.cssSelector("#black-studio-tinymce-4 > div > a > img")).click();

		return new CompatibilityTestingPage(driver);
	}

}
