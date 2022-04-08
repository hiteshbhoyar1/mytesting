package Baseclasses;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;

import utilityPackage.UtilityUsingPropertyFile;

public class BaseUsingPropertyFile {
	protected WebDriver driver;
	
	public void launchBrowser() throws IOException {
		System.setProperty("webdriver.chrome.driver", "D:\\Testing\\automation\\velocity\\chromedriver_win32\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get(UtilityUsingPropertyFile.getDataFromPropertyFile("URL"));
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		driver.manage().window().maximize();
		Reporter.log("Browser launch success",true);
	}
	public void closeBrowser() {
		driver.close();
		Reporter.log("Browser close success",true);
	}

}
