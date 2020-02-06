package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {
	
	public WebDriver driver;
	By signin=By.cssSelector("a[href*='sign_in']");
	By context= By.xpath("//div[@class='text-center']/h2");
	By popup=By.
	
	//By contact=By.linkText("Contact");
	
	By contact=By.xpath("//*[@id=\"homepage\"]/header/div[2]/div/nav/ul/li[8]/a");
	
	public LandingPage(WebDriver driver) {
		
		this.driver=driver;
	}

	public WebElement getContact()
	{
		
		return driver.findElement(contact);
}

	
	
	
	
	
	public WebElement getTitle()
	{
		
		return driver.findElement(context);
}

	
	


	public WebElement getLogin()
	{
		
		return driver.findElement(signin);
}


}
