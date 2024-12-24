package testCases;

import org.testng.annotations.Test;

import testBase.BaseClass;

public class TC003_Account003Test extends BaseClass{
	
	@Test
	public void getTC003_Account003Test()
	{
		logger.info("****** Startign getTC003_Account003Test()*****");
		System.out.println("Config Email Data="+p.getProperty("email"));
		System.out.println("getTC003_Account003Test");
		logger.info("****** Ending getTC003_Account003Test()*****");
	}

}
