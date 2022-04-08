package kitePOMtestNG;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class KitetestusingTestNG1 {
	WebDriver driver;
	Sheet mysheet;
	KiteLoginPage Login;
	KitePinPage Pin;
	KiteHomePage Home;
	
	
	@BeforeClass
	public void launchBrowser() throws EncryptedDocumentException, IOException {
		Reporter.log("launching the browser",true);
		System.setProperty("webdriver.chrome.driver", "D:\\Testing\\automation\\velocity\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--disable-notificatio");
		driver = new ChromeDriver(opt);
		driver.get("https://kite.zerodha.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		
		FileInputStream myfile= new FileInputStream("D:\\poi-bin-5.2.1-20220224\\sheet2.xlsx");
		 mysheet = WorkbookFactory.create(myfile).getSheet("sheet9");
		 Login= new KiteLoginPage(driver);
		 Pin= new KitePinPage(driver);
		 Home = new KiteHomePage(driver);
	}
	@BeforeMethod
	public void loginToKiteApp() {
		
		String USERID = mysheet.getRow(0).getCell(0).getStringCellValue();
		String PASSWORD = mysheet.getRow(0).getCell(1).getStringCellValue();
		String PIN = mysheet.getRow(0).getCell(2).getStringCellValue();
		Reporter.log("logging into kite app",true);
		Login.enterUseriID(USERID);
		Login.enterPassword(PASSWORD);
		Login.clickOnLoginButton();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		Reporter.log("entering pin page",true);
		Pin.enterPin(PIN);
		Pin.clickOnContinueButton();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		
	}
	@Test
	public void validateUserID() {
		Reporter.log("validating the userid",true);
		String expectedUserID = mysheet.getRow(0).getCell(0).getStringCellValue();
		String actualUserID = Home.getActualUserID();
		Assert.assertEquals(actualUserID, expectedUserID,"IDs not matching");
		Reporter.log("validate userid successfully",true);
	}
	
	@AfterMethod
	public void logoutKiteApp() throws InterruptedException {
		Reporter.log("logging out the kite app",true);
		Home.clickOnLogoutButton();
	}
	
	@AfterClass
	public void closeKiteApp() {
		Reporter.log("closing the browser",true);
		driver.quit();
	}
}
