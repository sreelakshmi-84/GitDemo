package resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.core.util.FileUtils;
//import org.apache.logging.log4j.core.util.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class base {
public static WebDriver driver;//static means we can access in all static and non static methods without creating object if all they are in same class
public Properties prop;
	public WebDriver initializeDriver() throws IOException {
		//chrome
		//firfox
		//iE
prop=new Properties();
FileInputStream fis= new FileInputStream("C:\\Users\\EliteBook\\E2EProject\\src\\main\\java\\resources\\data.properties");
prop.load(fis);

String browsername=prop.getProperty("browser");
if(browsername.equals("chrome"))
{
	
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\chromedriver_win32\\chromedriver.exe");
	driver=new ChromeDriver();
}

else if(browsername.equals("firefox"))
{
}
else if(browsername.equals("IE"))
{
}

driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
return driver;

	}
	/*public void getScreenshot() throws IOException
	{
		//Convert web driver object to TakeScreenshot
		TakesScreenshot scrShot =((TakesScreenshot)driver);
		//Call getScreenshotAs method to create image file
		File SrcFile=scrShot.getScreenshotAs( OutputType.FILE);
		
		///Move image file to new destination
		 File DestFile=new File("c://test//screenshot.png");

		//Copy file to Desired Location
		
		FileUtils.copyFile(SrcFile, DestFile);
		
		
	}*/
	/*public void takeScreenshot()

	{

	String screenName= System.currentTimeMillis()+ ".pnng";

	File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

	try

	{

	FileHandler.copy(src, new File(System.getProperty("user.dir")+"/target/Screenshots/"+screenName+""));

	}

	catch(IOException e)

	{

	System.out.println(e.getMessage());

	}*/

	
	
	
	
	

}
