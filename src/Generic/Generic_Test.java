package Generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Generic_Test implements Framework_Constants {
	public WebDriver driver;
	@BeforeMethod
	public void openApplctn() throws InterruptedException
	{
		System.setProperty(GECKO_KEY, GECKO_VALUE);
		WebDriver driver=new FirefoxDriver();
		driver.get(url);
		Thread.sleep(5000);
	}
	
	/*@AfterMethod
	public void closeApplctn()
	{
		driver.quit();
	}*/

}
