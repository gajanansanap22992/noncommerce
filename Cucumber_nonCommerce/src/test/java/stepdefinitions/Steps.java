package stepdefinitions;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import junit.framework.Assert;
import pageobjects.LoginPage;
import testbase.TestBase;

@SuppressWarnings("deprecation")
public class Steps extends TestBase
{
	public WebDriver driver;
	public LoginPage lp;
	@Before
	public void setup() throws IOException 
	{
		driver=getDriver();
		lp=new LoginPage(driver);
	}
	@Given("user open browser")
	public void user_open_browser() 
	//{logger.info("*** user opening browser");
	{
	   driver.manage().window().maximize();
	   driver.manage().deleteAllCookies();
	  	
	   driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	
	}

	@When("user open url {string}")
	public void user_open_url(String url) {
		//logger.info("*** user entering url");
	   driver.get(url);
	}

	
	@Then("user get login page {string}")
	public void user_get_login_page(String pagetitle) throws InterruptedException {
		Thread.sleep(3000);
		logger.info("*** user verifying home page if open");
		if(driver.getTitle().equals(pagetitle))
		{
			Assert.assertEquals(pagetitle, driver.getTitle());
		}
		else
		{
			Assert.assertTrue(false);
		}
	    
	}

	@Then("user enter login details username as {string} and password as {string}")
	public void user_enter_login_details_username_as_and_password_as(String email, String password) {
		logger.info("*** user entering email and password");
		lp.enterEmail(email);
		lp.enterPassword(password);
	  
	}

	@Then("user click on login button")
	public void user_click_on_login_button() {
		logger.info("*** user clicking on logging button");
	   lp.ClickOnLogginButton();
	}

	
	@Then("user get dashboard page with title {string}")
	public void user_get_dashboard_page_with_title(String pagetitle) throws InterruptedException {
		Thread.sleep(3000);
		logger.info("*** user verifying dashboard page");
		
		if(driver.getTitle().equals(pagetitle))
		{
			Assert.assertEquals(pagetitle, driver.getTitle());
		}
		else
		{
			Assert.assertTrue(false);
		}
	   
	}

	@When("user click on logout button")
	public void user_click_on_logout_button() throws InterruptedException {
		logger.info("*** user clicking on loggout");
		
	   lp.ClickOnLogoutButton();
	}

	
	@Then("user get home page with title {string}")
	public void user_get_home_page_with_title(String pagetitle) throws InterruptedException {
		Thread.sleep(3000);
		logger.info("*** verifying loggin page");
		if(driver.getTitle().equals(pagetitle))
		{
			Assert.assertEquals(pagetitle, driver.getTitle());
		}
		else
		{
			Assert.assertTrue(false);
		}
	}

	@Then("user close browser")
	public void user_close_browser() {
		logger.info("*** user closing browser");
	    driver.close();
	}


}
