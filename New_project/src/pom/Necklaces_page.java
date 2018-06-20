package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genric.Page;


public class Necklaces_page extends Page
{

	@FindBy(xpath="(//img[@class='hc img-responsive center-block' ])[1]")
	private WebElement Details;
	
	public Necklaces_page(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver, this);
	
	}
	public void moveJewellery() throws InterruptedException
	{
		Details.click();
		Thread.sleep(3000);
	} 

}
