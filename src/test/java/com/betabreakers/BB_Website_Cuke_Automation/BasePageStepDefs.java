package com.betabreakers.BB_Website_Cuke_Automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.betabreakers.PageObject.BlogPage;
import com.betabreakers.PageObject.CompanyPage;
import com.betabreakers.PageObject.ContactPage;
import com.betabreakers.PageObject.HomePage;
import com.betabreakers.PageObject.ServicesPage;
import com.betabreakers.PageObject.TestimonialsPage;
import com.betabreakers.PageObject.TheLabsPage;
import com.betabreakers.PageObject.WhyTestPage;

public class BasePageStepDefs {
	protected static WebDriver driver;
	protected HomePage homePage;
	protected ServicesPage servicesPage;
	protected WhyTestPage whyTestPage;
	protected TheLabsPage theLabsPage;
	protected CompanyPage companyPage;
	protected ContactPage contactPage;
	protected BlogPage blogPage;
	protected TestimonialsPage testimonialsPage;

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
