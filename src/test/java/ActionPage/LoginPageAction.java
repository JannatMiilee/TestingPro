package ActionPage;

import LocatorPage.LoginPageLocator;
import Utiliti.Parent_Base;
public class LoginPageAction extends Parent_Base {
	
	LoginPageLocator LoginPageLocator = new LoginPageLocator();
public void userLogin(String User, String Pass) throws Exception {
	LoginPageLocator.Email.sendKeys(User);
	LoginPageLocator.Pass.sendKeys(Pass);
	LoginPageLocator.LogInButton.click();
	Thread.sleep(4000);

}
}
