package LocatorPage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import Utiliti.Parent_Base;

public class LoginPageLocator extends Parent_Base{
	public LoginPageLocator() { //construstor
		
		PageFactory.initElements(driver, this);//'this' is a java keyword	
		}
	
	@FindBy(how=How.CSS, using="input[id='EmailAddress']")
	public WebElement Email;
	@FindBy(how=How.CSS, using="input[id='Password']")
	public WebElement Pass;
	@FindBy(how=How.CSS, using="button[id='sign-in-button']")
	public WebElement LogInButton;
}
	
