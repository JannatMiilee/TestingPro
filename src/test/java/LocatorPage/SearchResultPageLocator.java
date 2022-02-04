package LocatorPage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import Utiliti.Parent_Base;

public class SearchResultPageLocator extends Parent_Base{

	public SearchResultPageLocator() {
		PageFactory.initElements(driver, this);//'this' is a java keyword	
	}
	@FindBy(how=How.XPATH, using="//h2[@class='pageinfo']")
	public WebElement Result;
	
	
}
