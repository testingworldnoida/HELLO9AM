package listeners;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import base.InitiateDriver;

public class TC_001 extends InitiateDriver{
	
	@Test
	public void tc_001()
	{
		ExtentTest r1 = rep.startTest("TC_001_Login_validation");
	    driver.get("https://www.facebook.com");
    	driver.manage().window().maximize();
    	driver.findElement(By.xpath("//input[@type='submit']")).click();
    	r1.log(LogStatus.FAIL, "[Not Logged in successfully]");
    	rep.endTest(r1);
    	System.out.println("Hello Changes Done...");
	}

}
