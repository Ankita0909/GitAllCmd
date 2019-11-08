package Generic;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;


public class ScreenShot{

	
	public void photo(WebDriver driver) throws IOException
	{
		String pic="./ScreenShot/";
		Date d=new Date();
		String d1=d.toString();
		String date=d1.replaceAll(":", "/");
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		
		File dst=new File(pic+date+".jpeg");
		try
		{
			FileUtils.copyFile(src,dst);
		}
		catch(Exception e)
		{
			Reporter.log("Failed to captured screenshot",true);
		}
	}

}
