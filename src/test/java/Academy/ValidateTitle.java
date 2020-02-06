package Academy;



import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import pageObjects.Login;
import resources.base;

public class ValidateTitle extends base {
	
	
	public static Logger Log=LogManager.getLogger(ValidateTitle.class.getName());

	@BeforeTest
	public void initialize() throws IOException
	{
		driver=initializeDriver();
		Log.info("driver is installed");
		driver.get(prop.getProperty("url"));
		Log.info("Navigated to home page");
	}
	
	
	
	
	
	@Test	
	public void validateText() throws IOException
	{
		
	
		
		//inheritance
		//by using objects
		
LandingPage l=new LandingPage(driver);
//script should fail  with error if it is not matched
Assert.assertEquals(l.getTitle().getText(), "FEATURED COURSES");

//l.checkContact().isDisplayed()
Assert.assertTrue(l.getContact().isDisplayed());
Log.info("Successfully validated Text message");

		
	
	}
	
	@AfterTest
	public void teardown()
	{
		driver.close();
		
		driver=null;
	}
		
		
	
}
