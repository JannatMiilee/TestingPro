package LocatorPage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import Utiliti.Parent_Base;

public class StorageSolutionPageLocator extends Parent_Base{
	public StorageSolutionPageLocator() { //constructor
		
		PageFactory.initElements(driver, this);//'this' is a java keyword	
		}
	
	@FindBy(how=How.XPATH, using="//span[normalize-space()='Explore PowerScale for Google Cloud']")
	public WebElement ExplorePowerScaleforGoogleCloud;
	
}
