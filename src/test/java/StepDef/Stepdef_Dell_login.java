package StepDef;

import Utiliti.Parent_Base;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import ActionPage.HomePageAction;
import ActionPage.LoginPageAction;
import ActionPage.ProfilePageAction;
public class Stepdef_Dell_login extends Parent_Base {

	HomePageAction homePageAction = new HomePageAction();
	LoginPageAction loginPageAction = new LoginPageAction();
	ProfilePageAction profilePageAction= new ProfilePageAction();
	
	
	
	@Given("^Launch dell \"([^\"]*)\"$")
	public void launch_dell(String URL) throws Throwable {
		launchURL(URL);
	}
	@Then("^Mouseover Sign In and click on Sign In$")
	public void mouseiver_Sign_In_and_click_on_Sign_In() throws Throwable {
		homePageAction.clickSignIn();
	}

	@Then("^enter user and password and click login$")
	public void enter_user_and_password_and_click_login() throws Throwable {
		loginPageAction.userLogin(prop.getProperty("UserName"), prop.getProperty("Password"));	
	}

	@Then("^verify user is logged in$")
	public void verify_user_is_logged_in() throws Throwable {
		profilePageAction.verifyLoginPAge();
	}
}
