package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

public class PersonalDetails_Page {

	@FindBy(xpath="//p[contains(.,'enter your personal details for the fields')]")
	 private WebElement errmsg ;
	
	@FindBy(xpath="//input[@value='Next']")
	 private WebElement nxt ;
	
	@FindBy(xpath="//input[@id='contactNumber']")
	 private WebElement phno ;
	
	@FindBy(xpath="//input[@id='fullname']")
	 private WebElement name ;
	
	@FindBy(xpath="//textarea[@id='address']")
	 private WebElement address ;
	
	@FindBy(xpath="")
	 private WebElement pin ;
	
	@FindBy(xpath="")
	 private WebElement pan ;
	
	
	 public PersonalDetails_Page(WebDriver driver)
	 {
		 PageFactory.initElements(driver,this);
	 }
	 
	 public void click_Next()
	 {
		 nxt.click();
		 String s1=errmsg.getText();
		 try
		 {
			 Assert.assertTrue(s1.contains("Kindly enter your personal details for the fields"));
			 Reporter.log("Error msg displayed",true);
		 }
		 catch(AssertionError e)
		 {
			 Reporter.log("Error msg not displayed",true);
		 }
	 }
	 
	 public void fillinfo_next()
	 {
		 
		 nxt.click();
		 String s1=errmsg.getText();
		 try
		 {
			 Assert.assertTrue(s1.contains("Kindly enter your personal details for the fields"));
			 Reporter.log("Error msg displayed",true);
		 }
		 catch(AssertionError e)
		 {
			 Reporter.log("Error msg not displayed",true);
		 }
	 }
}


