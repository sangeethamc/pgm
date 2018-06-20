package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genric.Page;


public class Shopping_Bag extends Page
{
	@FindBy(xpath="//span[@id='total_quantity_price_2536186']")
	private WebElement price;
	
	@FindBy(xpath="//a[.=' Place Order ']")
	private WebElement placeorder;
	
	public Shopping_Bag(WebDriver driver) 
	{
		super(driver);PageFactory.initElements(driver, this);
	
	}
	public void Verifyprice(String p)
	{
		VerifyElement(p);
	}

	public void order()
	{
		placeorder.click();
	}
}
