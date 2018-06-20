package system_scripts;



import org.testng.annotations.Test;

import genric.Test_Base;
import pom.Necklaces_page;
import pom.Online_Homepage;
import pom.Shopping_Bag;
import pom.The_Sumiya_Necklace_page;

public class Script_1  extends Test_Base
{

	@Test
	public void test1() throws InterruptedException
	{
		Online_Homepage oh=new Online_Homepage(driver);
		oh.verifyHomepage("Online Jewellery Shopping Store India | Buy Gold and Diamond jewellery with Latest Designs 2018 | BlueStone.com");
		oh.moveJewellery();
		
		Necklaces_page np=new Necklaces_page(driver);
		np.moveJewellery();	

		The_Sumiya_Necklace_page sp=new The_Sumiya_Necklace_page(driver);
		sp.clickBuy();
		
		Shopping_Bag sb=new Shopping_Bag(driver);
		Thread.sleep(2000);
		sb.order();
		
	}

}
