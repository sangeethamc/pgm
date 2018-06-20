package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genric.Page;



public class The_Sumiya_Necklace_page  extends Page 
{
	@FindBy(xpath="//input[@id='buy-now']")
	private WebElement Buynow;	
	public The_Sumiya_Necklace_page(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	public void clickBuy() throws InterruptedException
	{
		
		Buynow.click();
		Thread.sleep(2000);
	}

}
