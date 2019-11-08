package Generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Open_CloseAppln implements Constants{

	public WebDriver driver;
	static
	{
		System.setProperty(chrome_key, chrome_value);
	}	
	@BeforeMethod
	public void openAppln()
	{
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.bluestone.com");
	}
	
	@AfterMethod
	public void closeAppln()
	{
		driver.quit();
	}
}
