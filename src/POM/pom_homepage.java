package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pom_homepage {
@FindBy(xpath="//input[@name='q']")
private WebElement textboxSearch;

@FindBy(xpath="//button[@type='submit']")
private  WebElement buttonSearch;

public pom_homepage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}

public void sendSearchBox()
{
	textboxSearch.sendKeys("Honor");
}
public void clickSearch()
{
	buttonSearch.click();
}


}
