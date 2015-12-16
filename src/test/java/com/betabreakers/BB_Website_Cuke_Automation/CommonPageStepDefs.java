package com.betabreakers.BB_Website_Cuke_Automation;

import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;


public class CommonPageStepDefs extends BasePageStepDefs {

	@Before
	public void setup() {
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
	}

	@After
	public void tearDown() {
		driver.quit();
	}


}
