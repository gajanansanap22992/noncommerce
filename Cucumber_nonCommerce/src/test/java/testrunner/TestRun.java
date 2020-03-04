package testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		plugin = { "pretty", "json:target/cucumber.json" },
		features = ".//FeatureFiles/Login.feature",
		glue = "stepdefinitions",
		dryRun=false,
		monochrome=true
		)
public class TestRun {

}
