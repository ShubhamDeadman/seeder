package tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import LibraryFunctions.BrowserFactory;
import Page.Login;

public class Logintestcase {

	WebDriver driver;
	
	@Test
	public void initBrowser()
	{
		driver = BrowserFactory.runBrowser("chrome", "http://10.232.237.143:443/TestMeApp/login.htm");
		Login log = new Login(driver);
		log.loginuser("lalitha", "Password123");
	}
	
	
}
