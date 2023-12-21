package Phase2.SeleniumGRID;

import java.net.MalformedURLException;

import org.testng.annotations.Test;

public class GridDemo1 extends HubandNode{
	
	@Test(priority='1')
	public void chromeTest1() throws MalformedURLException
	{
		hubNodeChromeDemo();
		driver.get("https://tutorialsninja.com/demo/");
	}
	
	@Test(priority='2')
	public void firefoxTest1() throws MalformedURLException
	{
		hubNodeFirefoxDemo();
		driver.get("https://tutorialsninja.com/demo/");
	}

}