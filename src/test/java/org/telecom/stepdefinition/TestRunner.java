package org.telecom.stepdefinition;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith (Cucumber.class)
@CucumberOptions (
		
		features=".//src//test//resources//AddCustomer.feature",
		glue ="org.telecom.stepdefinition",
		plugin = "html:target", 
		monochrome = true,
		dryRun = false,
		tags = {"@sanity,@smoke"}
		)

public class TestRunner {

	
}
