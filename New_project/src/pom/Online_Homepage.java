package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genric.Page;


public class Online_Homepage extends Page
{
	@FindBy(xpath="(//a[@href='https://www.bluestone.com/jewellery.html' and @title='Jewellery'])")
	private WebElement Jewellery;
	
	@FindBy(xpath="//a[.='Necklaces']")
	private WebElement Necklaces;
	
	@FindBy(xpath="//a[@title='Earrings']")
	private WebElement Earrings;
	

	@FindBy(xpath="//span[.='Danglers']")
	private WebElement Danglers;
	
	@FindBy(xpath="//span[@class='close-cta icon-close']")
	private WebElement close;
	
	@FindBy(xpath="(//a[@title='Pendants'])[1]")
	private WebElement pendant;

	
	public Online_Homepage(WebDriver driver) 
	{
		super(driver);
		PageFactory.initElements(driver, this);
		
	}
	public void verifyHomepage(String Hp_title)
	{
		VerifyTitle(Hp_title);
	}
	
	
	public void moveJewellery() throws InterruptedException
	{
		Thread.sleep(2000);
		String tit = driver.getTitle();
		System.out.println(tit);
		Thread.sleep(2000);
		Actions act=new Actions(driver);
		act.moveToElement(Jewellery).perform();
		Thread.sleep(3000);
		act.moveToElement(Necklaces).click().perform();
		Thread.sleep(3000);
		
	}
	public void verifyHomepage1(String title)
	{
		VerifyTitle(title);
	}
	public void moveEar() throws InterruptedException
	{
		Actions act1=new Actions(driver);
		act1.moveToElement(Earrings).perform();
		Thread.sleep(3000);
		act1.moveToElement(Danglers).click().perform();
		Thread.sleep(3000);
	
	}

}
