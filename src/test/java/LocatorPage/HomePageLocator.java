package LocatorPage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import Utiliti.Parent_Base;

public class HomePageLocator extends Parent_Base{
	public HomePageLocator() { //Constructor

		PageFactory.initElements(driver, this);//'this' is a java keyword	
	}
	//Locator for Dell login
	@FindBy(how=How.CSS, using="span[data-header-label='Sign In']")
	public WebElement SignInText;
	@FindBy(how=How.CSS, using="a[class='mh-btn mh-btn-primary navigate']")
	public WebElement SignInLink;

	//Locator for Dell Test Case Practice
	@FindBy(how=How.XPATH, using="//body/main[@class='hpg_main']/section/header[@id='unified-masthead']/div[@class='mh-bottom']/div[@id='unified-masthead-navigation']/nav[@class='mh-top-nav']/ul[@class='mh-top-menu-nav aria-nav']/li[4]/a[1]")
	public WebElement Solutions;
	@FindBy(how=How.XPATH, using="//*[@id=\"unified-masthead-navigation\"]/nav/ul/li[3]/ul/li[4]/a")
	public WebElement CloudSolutions;
	@FindBy(how=How.XPATH, using="//a[normalize-space()='Cloud Solutions for Storage']")
	public WebElement CloudSolutionsforStorage;
	
	//Locator for Verify search Result
	@FindBy(how=How.XPATH, using="//input[@id='mh-search-input']")
	public WebElement SearchBox;
	@FindBy(how=How.XPATH, using="//button[@aria-label='Search Dell.com']//*[name()='svg']")
	public WebElement SearchButton;
}



