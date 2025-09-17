package com.RunnerClasses;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/MyCucumberProject/MyCucumberProject/F05AmazonLinks.feature", 
					glue = "com.StepDef",
					tags = "@AllLinks")	
public class R05AmazonLinks {
	/*
	 * Execute Single Scenario -		tags = "@ElectronicsTest"
	 * Execute Multiple Scenarios - 	tags = "@ElectronicsTest or @BestSellersLink"
	 * Skip Single Scenario - 			tags = "not @BestSellersLink"
	 * Skip Multiple Scenarios - 		tags = "not @BestSellersLink and not @SellLink"
	 */

}
