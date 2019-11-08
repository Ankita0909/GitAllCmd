package POM;

import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DiamandRing_Page {

	 @FindBy(xpath="//ul/li//div[1]/span/span/span[1]/span[1]")
	 private List<WebElement> prices ;
	 
	 @FindBy(xpath="//span[.=' Popular ']")
	 private WebElement pupr;
	 
	 @FindBy(xpath="//a[.='Price Low to High ']")
	 private WebElement LtoH;
	 
	 @FindBy(xpath="//ul/li//div[1]/span/span/span[1]/span[1]")
	 private List<WebElement> LToH_Price ;
	 
	 public DiamandRing_Page(WebDriver driver)
	 {
		 PageFactory.initElements(driver,this);
	 }
	 
	WebElement we1;
	WebElement we2;
	ArrayList<String> l1=new ArrayList<>();
	ArrayList<String> l2=new ArrayList<>();
	 public void Get_Prices() 
	 {
		 System.out.println("Default Prices");
		 System.out.println(prices.size());
		 for(WebElement we1:prices)
		 {
			 String def = (we1.getText());
			 System.out.println(def);
			 l1.add(def);
		 }
	 }
 
	 public void Get_back(WebDriver driver)
	 {
		 Actions act=new Actions(driver);
		 act.moveToElement(pupr).perform();
		 
		 LtoH.click();
	 }
	 
	 public void LToHPrice()
	 {
		 System.out.println("Low to High Prices");
		 System.out.println(LToH_Price.size());
		 for(WebElement we2:LToH_Price)
		 {
			 String sort = (we2.getText());
			 System.out.println(sort);
			 l2.add(sort);
		 }
	 }
	 
	 public void compare()
	 {
		 System.out.println("l1= "+l1);
		 System.out.println("l2= "+l2);
		 System.out.println(l1.equals(l2));
	 }
}


	 

