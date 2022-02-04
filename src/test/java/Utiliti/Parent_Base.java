package Utiliti;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Parent_Base {
	public static Properties prop; //Global Property Class
	public static WebDriver driver; //Global object for WebDriver
	//In Parent_Base class we have constructor to communicate with config file.
	//For Config we use properties and FileInputStream Class.
	//In this class we use Browser initializer method and lunch url method

	public Parent_Base() {	//constructor method carries same name ass class name
		prop = new Properties();
		try {
			FileInputStream fls = new FileInputStream(System.getProperty("user.dir") + "\\src\\test\\java\\Config\\Config.properties");
			prop.load(fls);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	public void browserinitializer() {  //Reusable method to call the browser
		String BrowserName = prop.getProperty("Browser1");
		if (BrowserName.equalsIgnoreCase("Chrome")) {

			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(TestData.pageLoadTimeout, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(TestData.implicitlyWait, TimeUnit.SECONDS);
		} 
		else {
			System.out.println("Browser not found");//if in future we need to use any other browser ie FF
		}
	}

	public static void launchURL(String URL) {
		try {
			driver.get(prop.getProperty("url1"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

/*Launch Dell Application
Click Sing In - Home Page
Click Sign In 2 - Home Page
Enter UserName and Password - Login Page
Click Login - Profile Page
 */
