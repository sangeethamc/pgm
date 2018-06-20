package system_scripts;

import org.testng.annotations.Test;

import genric.Test_Base;
import pom.Danglers_page;
import pom.Online_Homepage;
import pom.The_charulatha_page;

public class Script_2 extends Test_Base
{
	@Test
	public void test2() throws InterruptedException 
	{
	Online_Homepage oh=new Online_Homepage(driver);
	oh.verifyHomepage1("Online Jewellery Shopping Store India | Buy Gold and Diamond jewellery with Latest Designs 2018 | BlueStone.com");
	oh.moveEar();
	
	Danglers_page dp=new Danglers_page(driver);
	Thread.sleep(1000);
	dp.clickcheck();
	dp.Scroll();
	
	The_charulatha_page tcp=new The_charulatha_page(driver);
	tcp.VerifyTitle("The Charulata Shringaar Drop Earrings | BlueStone.com");
	tcp.clicktryat();
}
}

