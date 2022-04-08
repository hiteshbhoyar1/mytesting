package kitePOMtestNG;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class KitetestusingTestNG {
	WebDriver driver;
	Sheet mysheet;
	KiteLoginPage login;
	KitePinPage pin;
	KiteHomePage home;
 @BeforeClass
 public void launchBrowser() throws EncryptedDocumentException, IOException {
	 Reporter.log("Launching the browser", true);
	 System.setProperty("webdriver.chrome.driver", "D:\\Testing\\automation\\velocity\\chromedriver_win32\\chromedriver.exe");
	 driver= new ChromeDriver();
	 driver.get("https://kite.zerodha.com/");
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
	 
	 FileInputStream myfile= new FileInputStream("D:\\poi-bin-5.2.1-20220224\\sheet2.xlsx");
	 mysheet = WorkbookFactory.create(myfile).getSheet("sheet8");
	 login= new KiteLoginPage(driver);
	 pin= new KitePinPage(driver);
	 home= new KiteHomePage(driver);
 }
 @BeforeMethod
 public void LoginTOKiteApp() {
	 Reporter.log("entering userid and password",true);
	String USERID = mysheet.getRow(0).getCell(0).getStringCellValue();
	String PASSWORD = mysheet.getRow(0).getCell(1).getStringCellValue();
	String PIN = mysheet.getRow(0).getCell(2).getStringCellValue();
	
	login.enterUseriID(USERID);
	login.enterPassword(PASSWORD);
	login.clickOnLoginButton();
	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
	Reporter.log("entering the pin",true);
	pin.enterPin(PIN);
	pin.clickOnContinueButton();
	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000)); 
 }
 @Test
 public void validateUserID() {
	 Reporter.log("validating the userid",true);
	String expectedUserID = mysheet.getRow(0).getCell(0).getStringCellValue();
	String actualUserID = home.getActualUserID();
	Assert.assertEquals(expectedUserID, actualUserID,"expected and actual userid not matching");
	Reporter.log("userid validate succesfully, TC is passed",true);
	  
 }
 @AfterMethod
 public void logoutFromKiteApp() throws InterruptedException {
	 Reporter.log("logging out the kite app",true);
	 home.clickOnLogoutButton();
	 
 }
 @AfterClass
 public void closeBrowser() {
	 Reporter.log("closing the browser",true);
	 driver.quit();
 }
}
