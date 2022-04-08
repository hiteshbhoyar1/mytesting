package zeroda_usingPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class KiteTestPOM {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Testing\\automation\\velocity\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://kite.zerodha.com/");
		
		Thread.sleep(2000);
		
		KiteLoginpagePOM log = new KiteLoginpagePOM(driver);
		log.senduserId();
		log.sendpassword();
		log.clickOnLogInButton();
		
		Thread.sleep(2000);
		
		KitePinPagePOM pin = new KitePinPagePOM(driver);
		pin.sendpin();
		pin.clickOnpinButton();
		
		Thread.sleep(2000);
		
		KitehomepagePOM home = new KitehomepagePOM(driver);
		home.validation();
		home.clickonUserId();
		home.clickonlogOutButton();
		
		Thread.sleep(2000);
		
		driver.quit();

	}

}
