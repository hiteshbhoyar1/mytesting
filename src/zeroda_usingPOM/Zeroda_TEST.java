package zeroda_usingPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zeroda_TEST {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Testing\\automation\\velocity\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://kite.zerodha.com/");
		
		Thread.sleep(2000);
		Zeroda_LoginpagePOM log1= new Zeroda_LoginpagePOM(driver);
		log1.senduserid();
		log1.sendpassword();
		log1.clickonloginbutton();

		Thread.sleep(2000);
		ZerodaPinpagePOM pin = new ZerodaPinpagePOM(driver);
		pin.sendpin();
		pin.clickoncontinuebutton();

		Thread.sleep(2000);
		ZerodaHomepagePOM home = new ZerodaHomepagePOM(driver);
		home.validation();
		home.clickonuserid();
		home.clickonlogoutbutton();

		Thread.sleep(2000);
		driver.quit();

	}

}
