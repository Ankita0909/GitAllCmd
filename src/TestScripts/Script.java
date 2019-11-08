package TestScripts;

import org.testng.annotations.Test;

import Generic.Open_CloseAppln;
import POM.DiamandRing_Page;
import POM.HomePage;

public class Script extends Open_CloseAppln{

	@Test
	public void test1() throws InterruptedException 
	{
		HomePage hp=new HomePage(driver);
		//Thread.sleep(2000);
		System.out.println("Hiiiiiiiiiiiiiiiiiiiiiiiii");
		System.out.println("Byeeeeeeeeeeeeeeeeeeeeeeeeeee");
		hp.mainmenus(driver);
		Thread.sleep(2000);
		DiamandRing_Page dp=new DiamandRing_Page(driver);
		dp.Get_Prices();
		Thread.sleep(2000);
		dp.Get_back(driver);
		Thread.sleep(2000);
		dp.LToHPrice();
		dp.compare();
	}
}
