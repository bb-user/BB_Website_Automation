package com.betabreakers.BB_Website_Cuke_Automation;

import org.junit.Assert;

import com.betabreakers.PageObject.HomePage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HomePageSteps extends BasePageStepDefs {

	@Given("^I am on the home page$")
	public void onHomePage() throws Throwable {
		homePage = new HomePage(driver);
		homePage.navigateToHomePage();
	}

	@When("^I click on Whats Your Next Project$")
	public void i_click_on_Whats_Your_Next_Project() throws Throwable {
		servicesPage = homePage.clickWhatsYourNextProject();

	}

	@Then("^I should be on the Services Page$")
	public void i_should_be_on_the_Services_Page() throws Throwable {
		Assert.assertTrue("Didn't make it to the Services Page", servicesPage
				.getPageTitle().toLowerCase().contains("services"));
	}

	/** Checking the previous clients links */
	@When("^I click on \"([^\"]*)\"$")
	public void shouldClickLink(String title) throws Throwable {
		testimonialsPage = homePage.clickOnPreviousClient(title.toLowerCase());
	}

	/** Confirming the correct client testimonials page was reached */
	@Then("^I check I am on \"([^\"]*)\"$")
	public void shouldCheckTitle(String title) throws Throwable {
		Assert.assertTrue(
				"Didn't make it to the client testimonials Page",
				testimonialsPage.getPageTitle().toLowerCase()
						.contains(title.toLowerCase()));
	}

	@When("^I click on the Functional Testing Icon$")
	public void clickOnTheFunctionalTestingIcon() throws Throwable {
		functionalTestingPage = homePage.clickOnFunctionalTestingIcon();
	}

	@Then("^I should be on the Functional Testing Page$")
	public void shouldBeOnTheFunctionalTestingPage() throws Throwable {
		Assert.assertTrue(
				"Didn't make it to the client functional testing Page",
				functionalTestingPage.getPageTitle().contains(
						"Functionality Testing"));
	}

	@When("^I click on the Compatibility Testing Icon$")
	public void clickOnTheCompatibilityTestingIcon() throws Throwable {
	    compatibilityTestingPage = homePage.clickOnCompatibilityTestingIcon();
	}

	@Then("^I should be on the Compatibility Testing Page$")
	public void shouldBeOnTheCompatibilityTestingPage() throws Throwable {
		Assert.assertTrue(
				"Didn't make it to the client functional testing Page",
				compatibilityTestingPage.getPageTitle().contains(
						"Compatibility Testing"));

	}

	/*
	 * @When("^I click a services link$") public void i_click_a_services_link()
	 * throws Throwable {
	 *
	 * }
	 *
	 * @Then("^I should be on that services page$") public void
	 * i_should_be_on_that_services_page() throws Throwable {
	 *
	 * }
	 *
	 * @When("^I click Follow Our Plog$") public void i_click_Follow_Our_Plog()
	 * throws Throwable {
	 *
	 * }
	 *
	 * @Then("^I should be on the first page of the block$") public void
	 * i_should_be_on_the_first_page_of_the_block() throws Throwable {
	 *
	 * }
	 *
	 * @When("^I click a blog link$") public void i_click_a_blog_link() throws
	 * Throwable {
	 *
	 * }
	 *
	 * @Then("^I should be on that blogs page$") public void
	 * i_should_be_on_that_blogs_page() throws Throwable {
	 *
	 * }
	 */

}
