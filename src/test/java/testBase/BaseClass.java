package testBase;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;  //Log4j
import org.apache.logging.log4j.Logger;  //Log4j


public class BaseClass {
	
	public Logger logger;  //Log4j
	public Properties p;
	
	@BeforeClass
	public void setup() throws IOException
	{
		
		//Loading config.properties file
		FileReader file=new FileReader("./src//test//resources//config.properties");
		p=new Properties();
		p.load(file);
		
					
		logger=LogManager.getLogger(this.getClass());  //lOG4J2
		
		logger.info("****** Startign setup()*****");
		
		System.out.println("setup");
		
		logger.info("****** Ending setup()*****");
 	}
	
	@AfterClass
	public void tearDown()
	{
		logger.info("****** Startign tearDown()*****");
		System.out.println("tearDown");
		logger.info("****** Ending tearDown()*****");
	}


}
