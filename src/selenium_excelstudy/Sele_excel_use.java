package selenium_excelstudy;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sele_excel_use {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		System.setProperty("webdriver.chrome.driver", "D:\\Testing\\automation\\velocity\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		WebElement username = driver.findElement(By.id("email"));
		WebElement password = driver.findElement(By.id("pass"));
		
		FileInputStream myfile= new FileInputStream("D:\\poi-bin-5.2.1-20220224\\sheet4.xlsx");
		Sheet sheet = WorkbookFactory.create(myfile).getSheet("sheet4");
		int rows = sheet.getLastRowNum();
		for(int i=0;i<=rows;i++) {
			short columns = sheet.getRow(i).getLastCellNum();
			for(int j=0;j<=columns-1;j++) {
				if(j==0) {
					String user = sheet.getRow(i).getCell(j).getStringCellValue();
					username.sendKeys(user);
					Thread.sleep(2000);
				}
				else {
					String pass = sheet.getRow(i).getCell(j).getStringCellValue();
					password.sendKeys(pass);
					Thread.sleep(2000);
				}
			}
			username.clear();
			Thread.sleep(2000);
			password.clear();
			Thread.sleep(2000);
			
		}
	}

}
