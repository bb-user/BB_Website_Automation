package com.betabreakers.BB_Website_Cuke_Automation;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(

		plugin = {"pretty", "json:target/json/output.json", "html:target/html/"},
		features = "src/test/resource"
		//tags = {"@Application"}													//For just scenarios with the @Application tag
		//tags = {"@Application, @Server"}											//For scenarios that are tagged with @Application or @Server
		)

public class RunnerTest {

}