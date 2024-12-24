package testCases;

import org.testng.annotations.Test;

import testBase.BaseClass;

public class TC001_Account001Test extends BaseClass{
	
	@Test
	public void getTC001_Account001Test()
	{
		logger.info("****** Startign getTC001_Account001Test()*****");
		System.out.println("Config File Data="+p.getProperty("execution_env"));
		System.out.println("getTC001_Account001Test");
		logger.info("****** Ending getTC001_Account001Test()*****");
	}

}
