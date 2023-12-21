package Phase2.SeleniumGRID;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HubandNode {
	
	public static WebDriver driver;
	
	@BeforeTest
	public static void hubNodeChromeDemo() throws MalformedURLException
	{
		ChromeOptions cap = new ChromeOptions();
		driver = new RemoteWebDriver(new URL("http://localhost:4449/wd/hub"),cap);
	    driver.manage().window().maximize();  
	 
	}
	@Test
	public void hubNodeFirefoxDemo() throws MalformedURLException
	{
		DesiredCapabilities cap = null;
		cap = new DesiredCapabilities();
		cap.setPlatform(Platform.WINDOWS);
		cap.setBrowserName("firefox");
		
		driver = new RemoteWebDriver(new URL("http://localhost:4449/wd/hub"),cap);
	}
	

}