package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GoogleDemo {
	WebDriver driver;
	
  @Test
  public void f() {
	System.setProperty("webdriver.gecko.driver", "C:\\Users\\A08019DIRP_C2C.04.02\\Downloads\\chromedriver_win32\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
	
	WebElement aboutus = driver.findElement(By.xpath("//*[@id=\"menu3\"]/li[3]/a"));
	
	
  }
}
