package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import LibraryFunctions.BrowserFactory;

public class LoginPageUsingFactory {

	
	WebDriver driver=BrowserFactory.runBrowser("chrome", "http://10.232.237.143:443/TestMeApp/login.htm");
	
	LoginPageUsingFactory log=PageFactory.initElements(driver, LoginPageUsingFactory.class);
	
	public LoginPageUsingFactory(WebDriver driver)
	{
		this.driver = driver;
	}
	@CacheLookup
	@FindBy(how=How.NAME, using="userName")
	WebElement username;
	
	@FindBy(how=How.NAME, using="password")
	WebElement password;
	
	@FindBy(how=How.NAME, using="login")
	WebElement signin;
	
	public void login(String un, String pass)
	{
		username.sendKeys(un);
		password.sendKeys(pass);
		signin.click();
		
	}
	
	
	
}
