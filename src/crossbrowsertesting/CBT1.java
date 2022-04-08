package crossbrowsertesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CBT1 {
	
	@Parameters("browserName")
  @Test
  public void crossBrowser(String browserName) throws InterruptedException {
		WebDriver driver=null;;
		
		if(browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "D:\\Testing\\automation\\velocity\\chromedriver_win32\\chromedriver.exe");
		 driver= new ChromeDriver();
			
		}
		else if(browserName.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "D:\\Testing\\automation\\velocity\\geckodriver.exe");
			 driver= new FirefoxDriver();
			
		}
		driver.get("https://vctcpune.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.close();
	  
  }
}
