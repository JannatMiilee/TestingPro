package LocatorPage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import Utiliti.Parent_Base;

public class ProfilePageLocator  extends Parent_Base{
	public ProfilePageLocator() { //Constructor

		PageFactory.initElements(driver, this);//'this' is a java keyword	
	}

@FindBy(how=How.ID, using="um-si-label")
public WebElement Verify;
}
