package POM;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Rings_Page {

	@FindBy(xpath="//span[.='Price']")
	 private WebElement price ;
	
	@FindBy(xpath="(//span[contains(.,'Below')])[1]")
	 private WebElement below_10k ;
	
	@FindBy(xpath="//ul[@id='product_list_ui']/li")
	 private List<WebElement> count_rings ;
	 
	@FindBy(xpath="//span[.='Delivery Time']")
	 private WebElement DeliveryTym ;
	
	@FindBy(xpath="(//span[.='Delivery Time']/../..//div/span)[1]")
	 private WebElement nextday ;
	
	@FindBy(xpath="//ul[@id='product_list_ui']/li")
	 private List<WebElement> count_nxtday ;
	
	@FindBy(xpath="(//span[.='Metal'])[1]")
	 private WebElement metal ;
	
	@FindBy(xpath="(//span[.='Metal']/../..//div/span)[5]")
	 private WebElement platinum ;
	
	@FindBy(xpath="//ul[@id='product_list_ui']/li")
	 private List<WebElement> count_platinum ;
	
	@FindBy(xpath="(//span[.='Metal']/../..//div/span)[1]")
	 private WebElement gold ;
	
	@FindBy(xpath="//ul[@id='product_list_ui']/li")
	 private List<WebElement> count_puregold ;
	
	@FindBy(xpath="(//span[.='Gender'])[1]")
	 private WebElement gndr ;
	
	@FindBy(xpath="(//span[.='Gender']/../..//div/span)[1]")
	 private WebElement women ;
	
	@FindBy(xpath="//ul[@id='product_list_ui']/li")
	 private List<WebElement> count_women ;
	
	 public Rings_Page(WebDriver driver)
	 {
		 PageFactory.initElements(driver,this);
	 }
	 
	 public void ring_price(WebDriver driver) throws InterruptedException
	 {
		Actions act=new Actions(driver);
		act.moveToElement(price).perform();
		 below_10k.click();
		 Thread.sleep(3000);
		 int count=count_rings.size();
		 System.out.println("No of rings below 10k= "+count);
	 }
	 
	 public void delivery_Time(WebDriver driver) throws InterruptedException
	 {
		Actions act=new Actions(driver);
		act.moveToElement(DeliveryTym).perform();
		nextday.click();
		 Thread.sleep(3000);
		 int count=count_nxtday.size();
		 System.out.println("Next day delivery rings = "+count);
	 }
	 
	 public void Metal(WebDriver driver) throws InterruptedException
	 {
		Actions act=new Actions(driver);
		act.moveToElement(metal).perform();
		platinum.click();
		 Thread.sleep(3000);
		 int count=count_platinum.size();
		 System.out.println("No of Platinum rings = "+count);
	 }
	 

	 public void PureGold(WebDriver driver) throws InterruptedException
	 {
		Actions act=new Actions(driver);
		act.moveToElement(metal).perform();
		gold.click();
		Thread.sleep(3000);
		int count=count_puregold.size();
		System.out.println("No of Gold rings = "+count);
	 }
	 
	 public void Gender(WebDriver driver) throws InterruptedException
	 {
		Actions act=new Actions(driver);
		act.moveToElement(gndr).perform();
		women.click();
		Thread.sleep(3000);
		int count=count_women.size();
		System.out.println("No of Womens rings = "+count);
	 }
}
