package LocatorPage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import Utiliti.Parent_Base;

public class PowerscaleForGoogleCloudLocator extends Parent_Base {

	@FindBy(how=How.XPATH, using="//span[normalize-space()='Read Technical Review']")
	public WebElement ReadTechnicalReview;
}
