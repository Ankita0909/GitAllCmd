package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Offers_Page {

	@FindBy(xpath="//span[.=' Popular ']")
	 private WebElement pupr;
	
	 public Offers_Page(WebDriver driver)
	 {
		 PageFactory.initElements(driver,this);
	 }

	
}
