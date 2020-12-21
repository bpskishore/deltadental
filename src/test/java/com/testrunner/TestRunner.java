package com.testrunner;

import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;
import cucumber.api.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions (
			format = {"pretty", "html:target/destinatin"},
			features = {"Feature"},
			glue = {"stepDefinitions"}
		)
public class TestRunner {

}