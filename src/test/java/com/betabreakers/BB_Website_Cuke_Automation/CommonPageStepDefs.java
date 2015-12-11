package com.betabreakers.BB_Website_Cuke_Automation;

import cucumber.api.java.After;
import cucumber.api.java.en.Given;

public class CommonPageStepDefs extends BasePageStepDefs{

/* these interfere with cucumber statements. The problem with these is that given the context of a specific scenario, we may not want these implemented, but
 * with these step defs we are givin not choice. Currently, it is quiting the drive rafer the firs test, preventing any others. 
	@After
	public void tearDown() {
		homePage.quitDriver();
	}

	@Given("^I am on the home page$")
	public void onHomePage() throws Throwable {

		homePage.navigateToHomePage();

	}
*/
//	@When("^I click on \"([^\"]*)\"$")
//	public void clickOn(String link) throws Throwable {
//		driver.findElement(By.id(link.toLowerCase() + "_link")).click();
//
//	}

}
