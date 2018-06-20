package genric;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

public class Page 
{
	public WebDriver driver;
	public  Page(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void VerifyTitle(String title)
	{
		WebDriverWait wait=new WebDriverWait(driver,10);
		try
		{wait.until(ExpectedConditions.titleContains(title));
	Reporter.log("TITLE IS MATCHING"+" " +title,true);	
	}
	catch(Exception e)
	{
		Reporter.log("TITLE IS NOT MATCHING",true);
		Assert.fail();
	}
}
	public void VerifyElement(String element)
	{
		WebDriverWait wait=new WebDriverWait(driver,10);
		try
		{wait.until(ExpectedConditions.titleContains(element));
	Reporter.log("ELEMENT IS MATCHING",true);	
	}
	catch(Exception e)
	{
		Reporter.log("ELEMENT IS NOT MATCHING",true);
		Assert.fail();
	}
	}	
	
}
