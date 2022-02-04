package ActionPage;

import org.openqa.selenium.JavascriptExecutor;

import LocatorPage.PowerscaleForGoogleCloudLocator;
import Utiliti.Parent_Base;

public class PowerscaleForGoogleCloudAction extends Parent_Base {
	PowerscaleForGoogleCloudLocator powerscaleForGoogleCloudLocator = new PowerscaleForGoogleCloudLocator();

	public void ClickReadTechnicalReview() throws Exception {
		((JavascriptExecutor)driver).executeScript("scroll(0, 2500)");
		Thread.sleep(2000);
		powerscaleForGoogleCloudLocator.ReadTechnicalReview.click();
	
	}
}
