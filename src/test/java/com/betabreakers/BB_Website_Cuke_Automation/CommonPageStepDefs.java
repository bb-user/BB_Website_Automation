package com.betabreakers.BB_Website_Cuke_Automation;

import cucumber.api.java.en.Given;

public class CommonPageStepDefs extends BasePageStepDefs{


//	@After
//	public void tearDown() {
//		homePage.quitDriver();
//	}

	@Given("^I am on the home page$")
	public void onHomePage() throws Throwable {

		homePage.navigateToHomePage();

	}

}
