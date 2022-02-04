package LocatorPage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import Utiliti.Parent_Base;

public class ModelWindowLocator extends Parent_Base {
	public ModelWindowLocator() { //constructor

		PageFactory.initElements(driver, this);//'this' is a java keyword	
	}
	@FindBy(how=How.XPATH, using="(//div[@class='card'])[3]")
	public WebElement SearchButton;
	@FindBy(how=How.XPATH, using="//*[@id=\"react-spectrum-45\"]")
	public WebElement SearchBox;
	@FindBy(how=How.XPATH, using="/html/body/div[7]/div[1]/div/a")
	public WebElement Closebutton;

}
