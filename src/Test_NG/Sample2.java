package Test_NG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Sample2 {
@Test(priority=1)
public void Demo2()
{
	Reporter.log("HHII", true);
}

@Test
public void Demo3()
{
	Reporter.log("Bye", true);
}
}
