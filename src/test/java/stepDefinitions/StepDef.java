package stepDefinitions;


import com.base.BaseDriver;
import com.example.ddns.SearchDentist;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDef extends BaseDriver {
	
	SearchDentist searchDentist = new SearchDentist();

	@Given("^click on find dentist from home page$")
	public void click_on_find_dentist_from_home_page() throws Throwable {
		
		searchDentist.findDoctor();
	}

	@When("^select zip code as (\\d+) and provider as \"([^\"]*)\" from dropdown$")
	public void specifyZipAndProvider(int zipCode, String provider) throws Throwable {
		
		searchDentist.selectZipAndProvider(zipCode, provider);
		
	}

	@Then("^search \"([^\"]*)\" from search page$")
	public void searchProvider(String provider) throws Throwable {
		
		searchDentist.searchProviderFromSearchPage(provider);
		quitDriver();
	}

}
