package ActionPage;

import org.testng.Assert;

import LocatorPage.SearchResultPageLocator;
import Utiliti.Parent_Base;

public class SearchResultPageAction extends Parent_Base {

	SearchResultPageLocator searchResultPageLocator = new SearchResultPageLocator();
	public void SearchResult() {
		boolean Verify = searchResultPageLocator.Result.isDisplayed();
		Assert.assertTrue(Verify);
	}
}
