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
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class demoditetestNG {
	WebDriver driver;
	Sheet mysheet;
	DemoSiteLogInPage login;

 @BeforeTest
 public void launchbrowser() throws EncryptedDocumentException, IOException {
	 System.setProperty("webdriver.chrome.driver", "D:\\Testing\\automation\\velocity\\chromedriver_win32\\chromedriver.exe");
	 driver= new ChromeDriver();
	 driver.get("http://uitestingplayground.com/sampleapp");
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
	 
	FileInputStream myfile= new FileInputStream("D:\\poi-bin-5.2.1-20220224\\sheet2.xlsx");
     mysheet = WorkbookFactory.create(myfile).getSheet("sheet10");
     
   login= new DemoSiteLogInPage(driver);
 }
 @Test
 public void loginInDemoSite() throws InterruptedException {
	String USERID = mysheet.getRow(0).getCell(0).getStringCellValue();
	String PASSWORD = mysheet.getRow(0).getCell(1).getStringCellValue();
	login.enterUserID(USERID);
	login.enterPassword(PASSWORD);
 
 
	 login.clickLogInButton();
 }
}
