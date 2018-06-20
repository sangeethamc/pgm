package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genric.Page;

public class The_charulatha_page  extends Page
{
	@FindBy(xpath="//a[.='Try at Home']")
	private WebElement tryathome;
	
	public The_charulatha_page(WebDriver driver) 
	{
		super(driver);
		PageFactory.initElements(driver, this);
	
	}
	
	public void verifyHomepage2(String title_of_charulatha)
	{
		VerifyTitle(title_of_charulatha);
	}
	
	public void clicktryat() throws InterruptedException 
	{
		tryathome.click();
	}
}
