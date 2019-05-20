package pck;

import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import library.Utility;

public class TestFacebook {

	@Test
	public void captureScreenshot() throws Exception
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\dlc\\Downloads\\chromedriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		Utility.capture(driver,"BrowserStarted");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@type='text'][@name='firstname']")).sendKeys("sandhya");
		
		Utility.capture(driver,"typeUname");
		
		
		
		System.out.println("ho gya");

	}

}
