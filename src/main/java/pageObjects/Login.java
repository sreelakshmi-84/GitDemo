package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login {
	
	public WebDriver driver;
	By email=By.id("user_email");
	By password=By.id("user_password");
	
	By login=By.cssSelector("[value='Log In']");
	
	public Login(WebDriver driver) {
		
		this.driver=driver;
	}



	public WebElement getEmail()
	{
		
		return driver.findElement(email);
}

	public WebElement getPassword()
	{
		
		return driver.findElement(password);
}

	
	public WebElement getlogin()
	{
		
		return driver.findElement(login);
}
}
