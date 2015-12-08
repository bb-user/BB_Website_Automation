package com.betabreakers.BB_Website_Cuke_Automation;

import cucumber.api.java.en.Given;

public class CommonPageStepDefs extends BasePageStepDefs{

//	@After
//	public void tearDown() {
//		driver.quit();
//	}

	@Given("^I am on the home page$")
	public void onZooSite() throws Throwable {
		driver.manage().window().maximize();
		driver.navigate().to("http://www.betabreakers.com");

	}

//	@When("^I click on \"([^\"]*)\"$")
//	public void clickOn(String link) throws Throwable {
//		driver.findElement(By.id(link.toLowerCase() + "_link")).click();
//
//	}

}
