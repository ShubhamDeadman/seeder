package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\A08019DIRP_C2C.04.02\\Downloads\\chromedriver_win32.chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://jqueryui.com/resources/demos/resizable/default.html");
		WebElement resize = driver.findElement(By.xpath(".//*[@id='resizable']/div[3]"));
		Actions action = new Actions(driver);
		action.dragAndDropBy(resize, 400, 200).perform();
	}
}
