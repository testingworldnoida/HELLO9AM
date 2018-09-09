package base;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.relevantcodes.extentreports.ExtentReports;

import listeners.ListenerImplementation;

public class InitiateDriver {
    public ChromeDriver driver ;
    public ExtentReports rep ;
    
    
    @BeforeSuite
    public void startReport()
    {
    	rep = new ExtentReports("./Reports/report.html");
    }
    
    @AfterSuite
    public void saveReport()
    {
    	rep.flush();
    	rep.close();
    }
    
	@BeforeMethod
	public void startBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
    	driver = new ChromeDriver();
    	driver.get("https://www.facebook.com");
    	
    	
	}
	
	@AfterMethod
	public void closeBrowser()
	{
		driver.quit();
	}
}
