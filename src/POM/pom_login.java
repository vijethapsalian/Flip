package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pom_login {
@FindBy(xpath="//input[@class='_2zrpKA _1dBPDZ']")
private WebElement userNameTextbox;

@FindBy(xpath="//input[@type='password']")
private WebElement passwordTextbox;

@FindBy(xpath="//button[starts-with(@class,'_2AkmmA')]/span[.='Login']")
private WebElement ButtonLogin;

public pom_login(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}

public void sendTextbox(String user)
{
userNameTextbox.sendKeys(user);
}

public void sendPassword(String pwd)
{
	passwordTextbox.sendKeys(pwd);
}

public void clickLogin()
{
	ButtonLogin.click();
}




	
	
}
