package com.automationpractice.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="D:\\Practice Workspace\\InfyProjectTest\\src\\main\\java\\Features",
		glue= {"stepdefinations"}
		strict = true,
		dryRun = false
	
		)

public class RunnerClass {

}
