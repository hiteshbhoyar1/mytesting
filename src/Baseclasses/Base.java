package Baseclasses;


import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;

public class Base {
	protected WebDriver driver;
	public void launchbrowser() {
		System.setProperty("webdriver.chrome.driver", "D:\\Testing\\automation\\velocity\\chromedriver_win32\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://kite.zerodha.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		Reporter.log("browser launch success", true);
	}
	
	public void closeBrowser() {
		driver.quit();
	}

}
