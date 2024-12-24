package testBase;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {
	
	
	@BeforeClass
	public void setup()
	{
		
		System.out.println("setup");
 	}
	
	@AfterClass
	public void tearDown()
	{
		System.out.println("tearDown");
	}


}
