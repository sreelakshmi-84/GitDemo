package StepDefinitions;

import org.junit.Assert;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.LandingPage;
import pageObjects.Login;
import pageObjects.portalHomepage;
import resources.base;

public class steDefinitions extends base {

	
	
	@Given("^Initialise browser with chrome$")
	public void initialise_browser_with_chrome() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver=initializeDriver();
	}

	@Given("^navigate to \"([^\"]*)\" site$")
	public void navigate_to_site(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.get(arg1);
	}

	@Given("^click on Login link in homepage to land on securesign in page$")
	public void click_on_Login_link_in_homepage_to_land_on_securesign_in_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		LandingPage l=new LandingPage(driver);
		l.getLogin().click();
	}

	@When("^user enters \"([^\"]*)\" and \"([^\"]*)\" and logs in$")
	public void user_enters_and_and_logs_in(String arg1, String arg2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Login lp=new Login(driver);
		lp.getEmail().sendKeys(arg1);
		lp.getPassword().sendKeys(arg2);
		lp.getlogin().click();
	}

	@Then("^verify that user is successfully logged in$")
	public void verify_that_user_is_successfully_logged_in() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
portalHomepage p=new portalHomepage(driver);
Assert.assertTrue(p.GetSearchBox().isDisplayed());
	}

	
	
	
	
	
	
	
	
	
	
	
	

}
