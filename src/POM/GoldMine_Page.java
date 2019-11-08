package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

public class GoldMine_Page {

	@FindBy(xpath="//input[@value='Start Now']")
	 private WebElement submit ;
	
	@FindBy(xpath="//input[@id='amount']")
	 private WebElement amt ;
	
	@FindBy(xpath="//input[@name='email']")
	 private WebElement email ;
	
	 public GoldMine_Page(WebDriver driver)
	 {
		 PageFactory.initElements(driver,this);
	 }
	 
	 public void click_Submit(WebDriver driver) throws InterruptedException
	 {
		 
		 submit.click();
		 String title1="Gold Mine Personal Detail | BlueStone.com";
		 String title=driver.getTitle();
//		 Reporter.log(title,true);
		 Thread.sleep(3000);
		 try
		 {
			 Assert.assertTrue(title.contains(title1));
			 Reporter.log("Both are same",true);
		 }
		 catch(AssertionError e)
		 {
			 Reporter.log("Error msg displayed",true);
		 }
		 
	 }
	 
	 public void same_Page(WebDriver driver) throws InterruptedException
	 {
		 String title=driver.getTitle();
		 Reporter.log("Current Page "+title,true);
		 
		 amt.sendKeys("25000");
		 email.sendKeys("ankita.t0909@gmail.com");
		 submit.click();
		 Thread.sleep(3000);
		 String title1=driver.getTitle();
		 
		 Reporter.log("Next Page "+title1,true);
		 Thread.sleep(3000);
		 try
		 {
			 Assert.assertTrue(title.contains(title1));
			 Reporter.log("Both are Matching,",true);
		 }
		 catch(AssertionError e)
		 {
			 Reporter.log("Not reflected same page",true);
		 }
		 
	 }
	 
	 public void next_Page(WebDriver driver) throws InterruptedException
	 {
		 
		 amt.sendKeys("25000");
		 email.sendKeys("ankita.t0909@gmail.com");
		 submit.click();
		 Thread.sleep(3000);
		 		 
		 String title=driver.getTitle();
//		 Reporter.log("Next Page "+title,true);
		 try
		 {
			 Assert.assertTrue(title.contains("Gold Mine Personal Detail | BlueStone.com"));
			 Reporter.log("Reflected in next page,",true);
		 }
		 catch(AssertionError e)
		 {
			 Reporter.log("Not reflected same page",true);
		 }
	 }
	 
	 public void notenterinfo(WebDriver driver) throws InterruptedException
	 {
		 
		 amt.sendKeys("25000");
		 email.sendKeys("ankita.t0909@gmail.com");
		 submit.click();
		 
	 }
}
