package Test_NG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Sample {
@Test(invocationCount=3,enabled=false)
public void Demo1()
{
	Reporter.log("CORONA DAYS", true);
}
@Test
public void Demo()
{
	Reporter.log("CORONA", true);
}
	
}
