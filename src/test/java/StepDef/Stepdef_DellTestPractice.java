package StepDef;

import ActionPage.HomePageAction;
import ActionPage.ModelWindowAction;
import ActionPage.PowerscaleForGoogleCloudAction;
import ActionPage.StorageSolutionPageAction;
import Utiliti.Parent_Base;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;



public class Stepdef_DellTestPractice extends Parent_Base{
	HomePageAction homePageAction = new HomePageAction();
	StorageSolutionPageAction storageSolutionPageAction = new StorageSolutionPageAction();
	PowerscaleForGoogleCloudAction powerscaleForGoogleCloudAction = new PowerscaleForGoogleCloudAction();
	ModelWindowAction modelWindowAction = new ModelWindowAction();
	
	@When("^Mouseover Solutions then Cloud Solutions and click Cloud Solutions for Storage$")
	public void mouseover_Solutions_then_Cloud_Solutions_and_click_Cloud_Solutions_for_Storage() throws Throwable {
		homePageAction.CloudSolutionsforStorage();
	}

	@When("^Scroll down and click on Explore PowerScale for Google Cloud$")
	public void scroll_down_and_click_on_Explore_PowerScale_for_Google_Cloud() throws Throwable {
		storageSolutionPageAction.ClickonExplorePowerScale();
	}

	@Then("^Scroll down and Click on Read Technical Review$")
	public void scroll_down_and_Click_on_Read_Technical_Review() throws Throwable {
		powerscaleForGoogleCloudAction.ClickReadTechnicalReview();
	}

	@Then("^Scrolldown and Click close button$")
	public void Scrolldown_and_Click_close_button() throws Throwable {
		modelWindowAction.ModelWindow();
	}
}
