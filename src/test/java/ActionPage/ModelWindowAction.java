package ActionPage;

import org.openqa.selenium.JavascriptExecutor;

import LocatorPage.ModelWindowLocator;
import Utiliti.Parent_Base;

public class ModelWindowAction extends Parent_Base {

	ModelWindowLocator modelWindowLocator = new ModelWindowLocator();

	/*Click search button
Type 'ESG Tested'
Close the model window*/
	public void ModelWindow() throws Exception {
		((JavascriptExecutor)driver).executeScript("window.scrollTo(0, document.body.scrollHeight);");
		Thread.sleep(2000);
		modelWindowLocator.Closebutton.click();
		
	}

}
