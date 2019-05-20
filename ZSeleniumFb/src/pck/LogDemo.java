package pck;


import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogDemo {

	public static void main(String[] args)
	{
		Logger logger = Logger.getLogger("LogDemo");
		PropertyConfigurator.configure("Log4j.properties");
		
        System.setProperty("webdriver.chrome.driver","C:\\Users\\dlc\\Downloads\\chromedriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		logger.info("chrome browser opened");
		
		  driver.manage().window().maximize();
		  logger.info("browser maximixzed...");
			
		
		driver.get("https://www.facebook.com/");
		logger.info("facebook started...app launched");
	
		driver.findElement(By.xpath("//input[@type='text'][@name='firstname']")).sendKeys("sandhya");
		
		driver.quit();
		logger.info("chrome stopped");

	}

}
