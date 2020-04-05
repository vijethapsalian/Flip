package TEST_SCRIPTS;

import org.testng.annotations.Test;

import Generic.Generic_Test;
import POM.pom_homepage;
import POM.pom_login;

public class LoginFlipkart extends Generic_Test{
	@Test
public void flipLogin()
{
 
	pom_login p=new pom_login(driver);
	p.sendTextbox("7353479043");
	p.sendPassword("seleniumlove");
	p.clickLogin();
	pom_homepage h=new pom_homepage(driver);
	h.sendSearchBox();
	h.clickSearch();
}
	
}
