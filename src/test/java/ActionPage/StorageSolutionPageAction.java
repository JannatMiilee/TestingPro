package ActionPage;

import org.openqa.selenium.JavascriptExecutor;

import LocatorPage.StorageSolutionPageLocator;
import Utiliti.Parent_Base;

public class StorageSolutionPageAction extends Parent_Base {
	StorageSolutionPageLocator storageSolutionPageLocator = new StorageSolutionPageLocator();
	
public void ClickonExplorePowerScale() throws Exception {
	((JavascriptExecutor)driver).executeScript("scroll(0, 2500)");
	storageSolutionPageLocator.ExplorePowerScaleforGoogleCloud.click();
	Thread.sleep(2000);
}
}