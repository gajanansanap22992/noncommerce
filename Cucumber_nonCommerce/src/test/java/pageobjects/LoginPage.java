package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utitlity.ProjectUtility;

public class LoginPage
{
	public WebDriver driver;
	public ProjectUtility utility;
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		utility=new  ProjectUtility();
		
	}
	
	@FindBy(xpath="//a[contains(text(),'Logout' )and @href='/logout']")
	WebElement logoutButton;
	
	@FindBy(xpath="//input[@name='Email']")
	WebElement txtEmail;
	
	@FindBy(xpath="//input[@name='Password']")
	WebElement txtPassword;
	
	@FindBy(xpath="//input[@class='button-1 login-button']")
	WebElement loginButton;
	
	
	public void enterEmail(String email)
	{
		txtEmail.sendKeys(email);
	}
	public void enterPassword(String password)
	{
		txtPassword.sendKeys(password);
	}
	public void ClickOnLogginButton()
	{
		utility.waitForElement(loginButton, 30);
		loginButton.click();
	}
	public void  ClickOnLogoutButton()
	{
		utility.waitForElement(logoutButton, 60);
		logoutButton.click();
	}
	
	

}
