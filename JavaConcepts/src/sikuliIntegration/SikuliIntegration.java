package sikuliIntegration;


import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class SikuliIntegration {
	
	public static void main(String[] args) throws FindFailed {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\TestingWorld\\Downloads\\chromedriver_win32 (6)\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		Screen search = new Screen();
		Pattern p = new Pattern("C:\\Users\\TestingWorld\\Desktop\\DOCS\\IM3.png");
	
		//driver.findElementByName("q").sendKeys("testing");
		search.wait(p,20);
		search.click(p);
		
	}

}