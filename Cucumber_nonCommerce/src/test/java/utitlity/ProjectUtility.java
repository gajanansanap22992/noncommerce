package utitlity;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import testbase.TestBase;

public class ProjectUtility extends TestBase
{
public void waitForElement(WebElement locator,long timeoutseconds)
{
	new WebDriverWait(driver,timeoutseconds).until(ExpectedConditions.elementToBeClickable(locator));
}
}
