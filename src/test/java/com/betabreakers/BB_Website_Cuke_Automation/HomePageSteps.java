package com.betabreakers.BB_Website_Cuke_Automation;

import org.junit.Assert;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HomePageSteps extends BasePageStepDefs
{

	@When("^I click on Whats Your Next Project$")
	public void i_click_on_Whats_Your_Next_Project() throws Throwable
	{
		servicesPage = homePage.clickWhatsYourNextProject();

	}

	@Then("^I should be on the Services Page$")
	public void i_should_be_on_the_Services_Page() throws Throwable
	{
			Assert.assertTrue("Didn't make it to the Services Page",
								servicesPage
									.getPageTitle()
									.toLowerCase()
									.contains("services"));
	}

	/**Checking the previous clients links*/
	@When("^I click on \"([^\"]*)\"$")
	public void shouldClickLink(String link) throws Throwable {
		testimonialsPage = homePage.clickOnPreviousClient(link);
	}

	/**Confirming the correct client testimonial page was reached*/
	@Then("^I check I am on \"([^\"]*)\"$")
	public void shouldCheckTitle(String title) throws Throwable {
		Assert.assertTrue("Didn't make it to the Services Page",
				testimonialsPage
					.getPageTitle()
					.toLowerCase()
					.contains(title.toLowerCase()));

	}

	@When("^I click a services link$")
	public void i_click_a_services_link() throws Throwable
	{

	}

	@Then("^I should be on that services page$")
	public void i_should_be_on_that_services_page() throws Throwable
	{

	}

	@When("^I click Follow Our Plog$")
	public void i_click_Follow_Our_Plog() throws Throwable
	{

	}

	@Then("^I should be on the first page of the block$")
	public void i_should_be_on_the_first_page_of_the_block() throws Throwable
	{

	}

	@When("^I click a blog link$")
	public void i_click_a_blog_link() throws Throwable
	{

	}

	@Then("^I should be on that blogs page$")
	public void i_should_be_on_that_blogs_page() throws Throwable
	{

	}

}
