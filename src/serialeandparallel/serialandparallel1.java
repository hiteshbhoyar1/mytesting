package serialeandparallel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class serialandparallel1 {
	 @Test
	  public void mymethod1() throws InterruptedException {
		  System.setProperty("webdriver.chrome.driver", "D:\\Testing\\automation\\velocity\\chromedriver_win32\\chromedriver.exe");
		    WebDriver driver = new ChromeDriver();
		    driver.get("https://www.flipkart.com/");
		    driver.manage().window().maximize();
		    Thread.sleep(1000);
		    driver.quit();
	}
}
