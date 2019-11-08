package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

public class Coins_Page {

	@FindBy(xpath="//span[.='(1 gram)']")
	 private WebElement gold1gm_coins ;
	 
	@FindBy(xpath="//span[.='(2 gram)']")
	 private WebElement gold2gm_coins ;
	
	@FindBy(xpath="//span[.='(20 gram)']")
	 private WebElement gold20gm_coins ;
	
	@FindBy(xpath="//span[.='(50 gram)']")
	 private WebElement gold50gm_coins ;
	
	@FindBy(xpath="//h1[contains(.,'2 gram 24 KT Lakshmi Gold Coin')]")
	 private WebElement Lakshmigold2gm_coins ;
	
	@FindBy(xpath="//h1[contains(.,'5 gram 24 KT Lakshmi Gold Coin')]")
	 private WebElement Lakshmigold5gm_coins ;
	
	@FindBy(xpath="//h1[contains(.,'10 gram 24 KT Lakshmi Gold Coin')]")
	 private WebElement Lakshmigold10gm_coins ;
	
	 public Coins_Page(WebDriver driver)
	 {
		 PageFactory.initElements(driver,this);
	 }
	
	public void verify_1grm()
	 {
		String s1=gold1gm_coins.getText();
		Assert.assertTrue(s1.contains("1 gram"));
		Reporter.log("1gm coin displayed",true);
	 }
	
	public void verify_2grm()
	 {
		String s1=gold2gm_coins.getText();
		Assert.assertTrue(s1.contains("2 gram"));
		Reporter.log("2gm coin displayed",true);
	 }
	
	public void verify_20grm()
	 {
		String s1=gold20gm_coins.getText();
		Assert.assertTrue(s1.contains("20 gram"));
		Reporter.log("20gm coin displayed",true);
	 }
	
	public void verify_50grm()
	 {
		String s1=gold50gm_coins.getText();
		Assert.assertTrue(s1.contains("50 gram"));
		Reporter.log("50gm coin displayed",true);
	 }
	
	public void verify_Lakshmi2grm()
	 {
		String s1=Lakshmigold2gm_coins.getText();
		Assert.assertTrue(s1.contains("2 gram"));
		Reporter.log("2gm Lakshmi coin displayed",true);
	 }
	
	public void verify_Lakshmi5grm()
	 {
		String s1=Lakshmigold5gm_coins.getText();
		Assert.assertTrue(s1.contains("5 gram"));
		Reporter.log("5gm Lakshmi coin displayed",true);
	 }
	
	public void verify_Lakshmi10grm()
	 {
		String s1=Lakshmigold10gm_coins.getText();
		Assert.assertTrue(s1.contains("10 gram"));
		Reporter.log("10gm Lakshmi coin displayed",true);
	 }
}
