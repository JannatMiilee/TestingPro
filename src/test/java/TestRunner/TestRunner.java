package TestRunner;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import Utiliti.Parent_Base;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = {"src/test/resources/Features"} , ////we are giving the info for the path of the feature file
plugin = {"json:target/cucumber.json"},//this plugin helps to generate our report as well as the console
//plugin = {"pretty","html:target/cucumber-reports/cucumber.html","json:target/cucumber-reports/cucumber.json"},
glue = "StepDef") //, tags= {"@Test2"})
public class TestRunner extends AbstractTestNGCucumberTests {

	@BeforeTest
	public void launchURL() {
		Parent_Base PB = new Parent_Base();
		PB.browserinitializer();
	}
	@AfterTest
	public void closeURL() {
		Parent_Base PB = new Parent_Base();	
		PB.driver.close();
		PB.driver.quit();
	}
}  
