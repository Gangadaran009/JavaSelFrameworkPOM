package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import testBase.BaseClass;
import utilities.DataProviders;

public class TC004_AccountDDT004Test extends BaseClass{
	@Test(dataProvider="LoginData", dataProviderClass=DataProviders.class)// getting data provider from different class
	public void verify_DDT(String email, String pwd, String exp) throws InterruptedException
	{
		logger.info("***** stating TC_004_DDT ******");
		
		try
		{
		System.out.println("Email="+email);
		System.out.println("Password="+pwd);
		System.out.println("Expression="+exp);

		
		}catch(Exception e)
		{
			Assert.fail();
		}
		Thread.sleep(3000);
		logger.info("***** Finished TC_004_DDT ******");
		
	}

	

}
