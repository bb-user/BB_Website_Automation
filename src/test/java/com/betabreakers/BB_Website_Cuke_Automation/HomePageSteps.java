package com.betabreakers.BB_Website_Cuke_Automation;

import org.junit.Assert;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HomePageSteps extends BasePageStepDefs
{
//	HomePage homePage = new HomePage(new FirefoxDriver());
//
//	@Given("^I am on the home page$")
//	public void i_am_on_the_home_page() throws Throwable
//	{
//	    System.out.println("this is where verficiation of home page with exception handling is done");
//	}



	@When("^I click on Whats Your Next Project$")
	public void i_click_on_Whats_Your_Next_Project() throws Throwable
	{
		servicesPage = homePage.clickWhatsYourNextProject();

	}

	@Then("^I should be on the Services Page$")
	public void i_should_be_on_the_Services_Page() throws Throwable
	{
//		System.out.println(servicesPage.getPageTitle());
			Assert.assertTrue("Didn't make it to the Services Page",
								servicesPage
									.getPageTitle()
									.equals("Software Quality Assurance & Testing Services | Beta Breakers"));


	}

	@When("^I click on a client$")
	public void i_click_on_a_client() throws Throwable
	{


	}

	@Then("^I should be on that clients referal page$")
	public void i_should_be_on_that_clients_referal_page() throws Throwable
	{


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
