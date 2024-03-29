package StepDef;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;


	@RunWith(Cucumber.class) //Require Junit dependency
	@CucumberOptions(features="src/test/resources/Features", //path of feature file
	glue = "StepDef",										// path of Step definitions file
	monochrome = true,										// display output in readable format
	plugin = {"pretty","html:target/htmlReports"},
	dryRun = false, // Req Cucumber JUnit dependency
	tags = "@Smoke"
	
	)
	public class RunnerTestClass {	
	
}
