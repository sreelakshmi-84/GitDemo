package Academy;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import pageObjects.Login;
import resources.base;

public class HomePage extends base {
	
	public static Logger Log=LogManager.getLogger(base.class.getName());
	
	
	/*@BeforeTest
	public void initialize() throws IOException
	{
		driver=initializeDriver();
		driver.get(prop.getProperty("url"));
	}*/
	

	@Test(dataProvider="getData")
	
	public void basepagenavigation(String Username,String Password,String text) throws IOException
	{
		
		driver=initializeDriver();//extend means all variable and methods of base class belongs to homepage and nonstatic method access all nonstatic methods without creating object if they were in same class
		driver.get(prop.getProperty("url"));
		
		//inheritance
		//by using objects
		
LandingPage l=new LandingPage(driver);
		l.getLogin().click();
		Login lp=new Login(driver);
		lp.getEmail().sendKeys(Username);
		lp.getPassword().sendKeys(Password);
		
		//System.out.println(text);
		Log.info("suceesfully login");
		lp.getlogin().click();
	}
	

	@AfterTest
	public void teardown()
	{
		driver.close();
		driver=null;
	}
		
	@DataProvider
	public Object[][] getData()
	{
		Object[][] data=new Object[2][3];
		
		data[0][0]="nonrestricteduser@qw.com";
		data[0][1]="123";
		data[0][2]="nonrestricteduser";
		
		
		data[1][0]="restricteduser@qw.com";
		data[1][1]="456";
		data[1][2]="restricteduser";
		
		return data;
		
	}
	
}
