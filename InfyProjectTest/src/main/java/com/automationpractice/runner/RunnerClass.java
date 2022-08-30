package com.automationpractice.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features=("src/main/java/Features"),
		glue= ("stepdefinations"),
		dryRun = false,
		format = {"pretty", "html:target/Destination"}
		)

public class RunnerClass  {

}
