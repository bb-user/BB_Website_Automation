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

	public WhyTestPage navigateToWhyTestPage() {
		driver.navigate().to("http://www.betabreakers.com/why-test");

		return new WhyTestPage(driver);
	}

	public TheLabsPage navigateToTheLabsPage() {
		driver.navigate().to("http://www.betabreakers.com/the-labs");

		return new TheLabsPage(driver);
	}

	public CompanyPage navigateToCompanyPage() {
		driver.navigate().to("http://www.betabreakers.com/company");

		return new CompanyPage(driver);
	}

	public ContactPage navigateToContactPage() {
		driver.navigate().to("http://www.betabreakers.com/contact");

		return new ContactPage(driver);
	}

	public BlogPage navigateToBlogPage() {
		driver.navigate().to("http://www.betabreakers.com/blog");

		return new BlogPage(driver);
	}

	public void quitDriver() {
		driver.quit();
	}



}
