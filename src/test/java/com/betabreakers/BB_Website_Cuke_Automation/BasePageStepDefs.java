package com.betabreakers.BB_Website_Cuke_Automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.betabreakers.PageObject.BlogPage;
import com.betabreakers.PageObject.CompanyPage;
import com.betabreakers.PageObject.CompatibilityTestingPage;
import com.betabreakers.PageObject.ContactPage;
import com.betabreakers.PageObject.FunctionalTestingPage;
import com.betabreakers.PageObject.HomePage;
import com.betabreakers.PageObject.ServicesPage;
import com.betabreakers.PageObject.TestimonialsPage;
import com.betabreakers.PageObject.TheLabsPage;
import com.betabreakers.PageObject.WebsiteTestingPage;
import com.betabreakers.PageObject.WhyTestPage;

public class BasePageStepDefs {

	protected HomePage homePage;
	protected ServicesPage servicesPage;
	protected WhyTestPage whyTestPage;
	protected TheLabsPage theLabsPage;
	protected CompanyPage companyPage;
	protected ContactPage contactPage;
	protected BlogPage blogPage;
	protected TestimonialsPage testimonialsPage;
	protected FunctionalTestingPage functionalTestingPage;
	protected CompatibilityTestingPage compatibilityTestingPage;
	protected WebsiteTestingPage websiteTestingPage;

	BasePageStepDefs() {
		//getDriver();
	}

	protected static WebDriver driver;

	protected WebDriver getDriver() {
		if (driver == null) {
			driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
		return driver;
	}
}
