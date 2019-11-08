package POM;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class HomePage{
	
	 @FindBy(xpath="(//a[contains(.,'Rings')])[1]")
	 private WebElement rng;
	 
	 @FindBy(xpath="(//a[.='Diamond'])[1]")
	 private WebElement dimndrng ;
	 
	 @FindBy(xpath="//a[@title='Jewellery']")
	 private WebElement allJewel ;
	 
	 @FindBy(xpath="//a[.='Kadas']")
	 private WebElement kadas ;
	 
	 @FindBy(xpath="//a[@title='Offers']")
	 private WebElement offers ;
	 
	 @FindBy(xpath="//a[@title='Coins']")
	 private WebElement coins ;
	 
	 @FindBy(xpath="(//span[.='1 gram'])[1]")
	 private WebElement gold1_coins ;
	 
	 @FindBy(xpath="(//span[.='2 gram'])[1]")
	 private WebElement gold2_coins ;
	 
	 @FindBy(xpath="(//span[.='20 gram'])[1]")
	 private WebElement gold20_coins ;
	 
	 @FindBy(xpath="(//span[.='50 gram'])[1]")
	 private WebElement gold50_coins ;
	 
	 @FindBy(xpath="(//span[.='2 gram'])[2]")
	 private WebElement Lakshmigold2_coins ;
	 
	 @FindBy(xpath="(//span[.='5 gram'])[2]")
	 private WebElement Lakshmigold5_coins ;
	 
	 @FindBy(xpath="(//span[.='10 gram'])[1]")
	 private WebElement Lakshmigold10_coins ;
	 
	 @FindBy(xpath="//input[@name='search_query']")
	 private WebElement search_rngs ;
	 
	 @FindBy(xpath="//input[@name='submit_search']")
	 private WebElement submit ;
	 
	 @FindBy(xpath="//strong[.='10 + 1']")
	 private WebElement goldmine ;
	
	 @FindBy(xpath="//ul[@id='product_list_ui']/li[10]")
	 private WebElement scrollelent ;
	 
	 @FindBy(xpath="//a[@title='Back to Top']")
	 private WebElement topicon ;
	 
	 public HomePage(WebDriver driver)
	 {
		 PageFactory.initElements(driver,this);
	 }
	 
	
	 public void mainmenus(WebDriver driver) throws InterruptedException 
	 {
		 
		Actions act=new Actions(driver);
		act.moveToElement(rng).perform();
		
		Thread.sleep(3000);
		dimndrng.click();
	 }
	 
	 public void main(WebDriver driver) throws InterruptedException 
	 {
		 
		Actions act=new Actions(driver);
		act.moveToElement(allJewel).perform();
		
		Thread.sleep(3000);
		kadas.click();
	 }
	 
	 public void offers()
	 {
		 offers.click();
	 }
	 
	 public void coins1gm_menu(WebDriver driver) throws InterruptedException
	 {
		 Actions act=new Actions(driver);
		act.moveToElement(coins).perform();
			
		Thread.sleep(3000);
		gold1_coins.click();
	 }
	 
	 public void coins2gm_menu(WebDriver driver) throws InterruptedException
	 {
		 Actions act=new Actions(driver);
		act.moveToElement(coins).perform();
			
		Thread.sleep(3000);
		gold2_coins.click();
	 }
	 
	 public void coins20gm_menu(WebDriver driver) throws InterruptedException
	 {
		 Actions act=new Actions(driver);
		act.moveToElement(coins).perform();
			
		Thread.sleep(3000);
		gold20_coins.click();
	 }
 
	 public void coins50gm_menu(WebDriver driver) throws InterruptedException
	 {
		 Actions act=new Actions(driver);
		act.moveToElement(coins).perform();
			
		Thread.sleep(3000);
		gold50_coins.click();
	 }
	 
	 public void Lakshmicoins2gm_menu(WebDriver driver) throws InterruptedException
	 {
		 Actions act=new Actions(driver);
		act.moveToElement(coins).perform();
			
		Thread.sleep(3000);
		Lakshmigold2_coins.click();
	 }
	 
	 public void Lakshmicoins5gm_menu(WebDriver driver) throws InterruptedException
	 {
		 Actions act=new Actions(driver);
		act.moveToElement(coins).perform();
			
		Thread.sleep(3000);
		Lakshmigold5_coins.click();
	 }
	 
	 public void Lakshmicoins10gm_menu(WebDriver driver) throws InterruptedException
	 {
		 Actions act=new Actions(driver);
		act.moveToElement(coins).perform();
			
		Thread.sleep(3000);
		Lakshmigold10_coins.click();
	 }
	 
	 public void Scroll(WebDriver driver) throws InterruptedException
	 {
		 Search_Ring();
		 Thread.sleep(3000);
		 
		 Point loc = scrollelent.getLocation();
		 int x=loc.getX();
		 System.out.println(x);
		 int y=loc.getY();
		 System.out.println(y);
		 JavascriptExecutor js=(JavascriptExecutor)driver;
		 js.executeScript("window.scroll("+x+","+y+")");
		 
		 WebDriverWait wait=new WebDriverWait(driver, 15);
		 wait.until(ExpectedConditions.elementToBeClickable(topicon)).click();
		 
	 }
	 
	 public void Search_Ring()
	 {
		 search_rngs.sendKeys("rings");
		 submit.click();
	 }
	 
	 public void gold_Mine()
	 {
		 goldmine.click();
	 }
}
