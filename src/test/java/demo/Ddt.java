package demo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Ddt {
	
	WebDriver driver;
	@Test
	public void readdata() throws IOException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\A08019DIRP_C2C.04.02\\Downloads\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
		
		driver.findElement(By.name("SignIn")).click();
		File src = new File("C:\\Users\\A08019DIRP_C2C.04.02\\Desktop\\Shubham\\Book1.xlsx");

		FileInputStream fis = new FileInputStream(src);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet1 = wb.getSheetAt(0);
		for(int i=0; i<3;i++)
		{
		String data0 = sheet1.getRow(i).getCell(0).getStringCellValue();
		String data1 = sheet1.getRow(i).getCell(1).getStringCellValue();
		System.out.println("Data from excel is : "+data0+" "+data1);
		}
		
		sheet1.getRow(0).createCell(2).setCellValue("pass");
	sheet1.getRow(1).createCell(2).setCellValue("fail");
	
	FileOutputStream fo = new FileOutputStream(src);
	wb.write(fo);
		driver.navigate().back();
		wb.close();
		
	}

}
