package POM;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

import Generic.ScreenShot;

public class Kadas_Page extends ScreenShot{
	
	@FindBy(xpath="(//ul[@id='product_list_ui']/li[5])[1]")
	 private WebElement anykada;
	
	@FindBy(xpath="(//ul/li[5]//a[contains(.,'View Details >>')])[1]")
	 private WebElement view;
	
	@FindBy(xpath="//input[@id='buy-now']")
	 private WebElement buynow;
	
	@FindBy(xpath="//div[@id='sizeList']/div/ul/li[2]")
	 private WebElement size;
	
	@FindBy(xpath="//span[.=' Select Size ']")
	 private WebElement selectsize;
	
	@FindBy(xpath="//span[@class='size-box-overlay']")
	 private WebElement selected_size;
	
	 public Kadas_Page(WebDriver driver)
	 {
		 PageFactory.initElements(driver,this);
	 }
	 
	 public void select_kada()
	 {
		 anykada.click(); 
	 }
	 
	 public void Buy_NowPage(WebDriver driver) throws InterruptedException, IOException
	 {
		buynow.click();
		Thread.sleep(3000);
		ScreenShot st=new ScreenShot();
		st.photo(driver);				
	 }
	 
	 String s1;
	 public void Bangle_size() throws InterruptedException
	 {
		 selectsize.click();
		 Thread.sleep(3000);
		 s1=size.getText();
		 System.out.println("s1=  "+s1);
		 size.click();
		 
//		 String s2=selected_size.getText();
//		 System.out.println("s2=  "+s2);
//		 
//		 Assert.assertTrue(s1.contains(s2));
		 
	 }
	 public void compare() throws InterruptedException
	 {
		 //Bangle_size();
		 
		 
		 String s2=selected_size.getText();
		 System.out.println("s2=  "+s2);
		 
		 Assert.assertTrue(s1.contains(s2));
		 Reporter.log("Both are same",true);
	 }
 
}
