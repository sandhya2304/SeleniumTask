package pck;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Fileupload
{
	
	@Test
	public void fileup() throws Exception
	{
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\dlc\\Downloads\\chromedriver\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.get("file:///C:/Users/dlc/Desktop/merifile.html");
	
	driver.findElement(By.name("myfile")).click();
	
	Runtime.getRuntime().exec("C:\\Users\\dlc\\Desktop\\Open.exe");
	

	}
}
