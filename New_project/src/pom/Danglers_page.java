package pom;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



import genric.Page;

public class Danglers_page extends Page
{

	@FindBy(xpath="//section[@class='block sort-by pull-right']/span")
	private WebElement checkbox;
	
	@FindBy(xpath="//a[.='Price High to Low ']")
	private WebElement Price;
	
	@FindBy(xpath="(//img[@class='hc img-responsive center-block' ])[11]")
	private WebElement Try;

	public Danglers_page(WebDriver driver) 
	{
		super(driver);
		PageFactory.initElements(driver, this);
	
	}
	
	public void clickcheck() throws InterruptedException 
	{
		checkbox.click();
		Thread.sleep(2000);
		Price.click();
	}
	
	public void Scroll() throws InterruptedException
	{
		Point loc=Try.getLocation();
		System.out.println(loc);
		int x=loc.getX();
		System.out.println(x);
		int y=loc.getY();System.out.println(y);Thread.sleep(2000);
		JavascriptExecutor	js=(JavascriptExecutor) driver;Thread.sleep(2000);
		js.executeScript("window.scrollBy("+x+","+y+")");
		Thread.sleep(2000);
		Try.click();
		Thread.sleep(2000);
	
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}