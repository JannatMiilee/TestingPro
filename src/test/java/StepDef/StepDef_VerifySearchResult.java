package StepDef;

import ActionPage.HomePageAction;
import ActionPage.SearchResultPageAction;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDef_VerifySearchResult {
	HomePageAction homePageAction = new HomePageAction();
	SearchResultPageAction searchResultPageAction = new SearchResultPageAction();
	
	@When("^Enter XPS in search field and click search$")
	public void enter_XPS_in_search_field_and_click_search() throws Throwable {
		homePageAction.SearchXPS(); 
	}

	@Then("^Verify search result$")
	public void verify_search_result() throws Throwable {
		searchResultPageAction.SearchResult(); 
	}

	
}
