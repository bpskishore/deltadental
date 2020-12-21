package stepDefinitions;


import com.base.BaseDriver;
import com.example.google.GoogleSearch;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDef extends BaseDriver {
	
	@Given("^I want to write a step with precondition$")
	public void i_want_to_write_a_step_with_precondition() throws Throwable {
		
		GoogleSearch gs = new GoogleSearch();
		gs.searchText("Hello");
	}

	@When("^I complete action$")
	public void i_complete_action() throws Throwable {
	}

	@Then("^I validate the outcomes$")
	public void i_validate_the_outcomes() throws Throwable {
		//quitDriver();
	}


}
