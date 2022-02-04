package ActionPage;

import Utiliti.Parent_Base;

import org.openqa.selenium.interactions.Actions;

import LocatorPage.HomePageLocator;

public class HomePageAction extends Parent_Base {
	HomePageLocator HomePageLocator = new HomePageLocator();
	//Dell login test case action
	public void clickSignIn() { 
		//HomePageLocator.SignInText.click();
		Actions ac = new Actions(driver);
		ac.moveToElement(HomePageLocator.SignInText).build().perform();
		HomePageLocator.SignInLink.click();
	}
	
	//Dell Test Practice Action
		public void CloudSolutionsforStorage() {
		Actions ac = new Actions(driver);
		ac.moveToElement(HomePageLocator.Solutions).build().perform();
		ac.moveToElement(HomePageLocator.CloudSolutions).build().perform();
		HomePageLocator.CloudSolutionsforStorage.click();
	}
	//Verify search Result Action
		
		public void SearchXPS() {
		HomePageLocator.SearchBox.sendKeys("XPS");
		HomePageLocator.SearchButton.click();
}
}	
