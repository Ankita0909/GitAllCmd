package TestScripts;

import java.io.IOException;

import org.testng.annotations.Test;

import Generic.Open_CloseAppln;
import POM.HomePage;
import POM.Kadas_Page;

public class Script8 extends Open_CloseAppln{

	@Test
	public void test7() throws InterruptedException, IOException 
	{
		HomePage hp=new HomePage(driver);
		hp.main(driver);
		Thread.sleep(3000);
		Kadas_Page kp=new Kadas_Page(driver);
		kp.select_kada();
		Thread.sleep(3000);
		kp.Bangle_size();
		Thread.sleep(3000);
		kp.Buy_NowPage(driver);
		Thread.sleep(3000);
		kp.compare();
	}
}
