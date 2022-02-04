package ActionPage;


import org.testng.Assert;

import LocatorPage.ProfilePageLocator;
import Utiliti.Parent_Base;

public class ProfilePageAction extends Parent_Base {
	ProfilePageLocator ProfilePageLocator = new ProfilePageLocator();
	public void verifyLoginPAge() {
	boolean profile = ProfilePageLocator.Verify.isDisplayed();
	Assert.assertTrue(profile);
}
}