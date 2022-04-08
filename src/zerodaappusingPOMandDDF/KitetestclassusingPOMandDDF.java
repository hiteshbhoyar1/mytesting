package zerodaappusingPOMandDDF;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class KitetestclassusingPOMandDDF {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		
		FileInputStream myfile = new FileInputStream("D:\\poi-bin-5.2.1-20220224\\sheet2.xlsx");
		Sheet mysheet = WorkbookFactory.create(myfile).getSheet("sheet8");
		
		System.setProperty("webdriver.chrome.driver", "D:\\Testing\\automation\\velocity\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions opt= new ChromeOptions();
		opt.addArguments("headless");
		opt.addArguments("Incognito");
		opt.addArguments("start-maximized");
	
		opt.addArguments("disable-infobars");
		
		WebDriver driver= new ChromeDriver(opt);
		driver.get("https://kite.zerodha.com/");
		Thread.sleep(2000);
		
		Kiteloginpage login= new Kiteloginpage(driver);
		login.senduserid(mysheet.getRow(0).getCell(0).getStringCellValue());
		login.sendpassword(mysheet.getRow(0).getCell(1).getStringCellValue());
		login.clickOnloginButton();
		
		Thread.sleep(2000);
		Kitepinpage pin =new Kitepinpage(driver);
		pin.sendpin(mysheet.getRow(0).getCell(2).getStringCellValue());
		pin.clickonContinueButton();
		
		Thread.sleep(2000);
		KiteHomepage homepage =new KiteHomepage(driver);
		homepage.validationofid(mysheet.getRow(0).getCell(0).getStringCellValue());
		
		Thread.sleep(2000);
		homepage.clickOnLogoutButton();

	}

}
