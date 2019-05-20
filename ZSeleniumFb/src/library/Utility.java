package library;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Utility 
{
	
	public static void capture(WebDriver driver,String img) 
	{
		try
		{
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(source, new File("./screenshots/"+img+".png"));
		}catch(Exception e)
		{
			System.out.println("errororo"+e.getMessage());
		}
	}
	
	

}
