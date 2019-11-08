package TestScripts;

import java.io.IOException;

import org.testng.annotations.Test;

import Generic.Open_CloseAppln;
import POM.Coins_Page;
import POM.HomePage;

public class Script16 extends Open_CloseAppln {

	@Test
	public void test10() throws InterruptedException, IOException 
	{
		HomePage hp=new HomePage(driver);
		hp.coins20gm_menu(driver);
		Thread.sleep(3000);
		Coins_Page cp=new Coins_Page(driver);
		cp.verify_20grm();
	}
}
