package testbase;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.logging.Logger;

import org.apache.commons.logging.impl.Log4JLogger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase 
{
	public static WebDriver driver;
	public static String propertyfile="src/main/java/config.properties";
	public File src;
	public FileInputStream fis;
	public static Properties prop;
	 public static Logger logger;
	
	public WebDriver getDriver() throws IOException
	{
		 src=new File(propertyfile);
		 fis=new FileInputStream(src);
		 prop=new Properties();
		
		 logger=Logger.getLogger("log4j");
		   PropertyConfigurator.configure("log4j.properties");
		 prop.load(fis);
		String browser=prop.getProperty("browser");
		if(browser.equals("chrome")) 
		{
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "\\src\\main\\java\\Drivers\\chromedriver.exe");
			driver=new ChromeDriver();
	}
		
		else if(browser.equals("ff"))
		{
			System.setProperty("webdriver.chrome.driver",prop.getProperty("ffpath"));	
			driver=new FirefoxDriver();
			}
	return driver;
	}

}
