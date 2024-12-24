package testCases;

import org.testng.annotations.Test;

import testBase.BaseClass;

public class TC002_Account002Test extends BaseClass{
	
	@Test
	public void getTC002_Account002Test()
	{
		logger.info("****** Startign getTC002_Account002Test()*****");
		System.out.println("APP URL Data="+p.getProperty("appURL2"));
		System.out.println("getTC002_Account002Test");
		logger.info("****** Ending getTC002_Account002Test()*****");
	}

}
