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

public class ZerodawithDFFmulti {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
	
		
		FileInputStream myfile= new FileInputStream("D:\\poi-bin-5.2.1-20220224\\sheet2.xlsx");
		Sheet sheet = WorkbookFactory.create(myfile).getSheet("sheet5");
		int TotalRows = sheet.getLastRowNum();
		System.out.println(TotalRows);
		System.setProperty("webdriver.chrome.driver", "D:\\Testing\\automation\\velocity\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://kite.zerodha.com/");
		Thread.sleep(2000);
		for(int i=0;i<=TotalRows;i++) {
			Thread.sleep(2000);	
		
		String userid = sheet.getRow(i).getCell(0).getStringCellValue();
		String password= sheet.getRow(i).getCell(1).getStringCellValue();
		String pinid = sheet.getRow(i).getCell(2).getStringCellValue();
		
		WebElement useridfield = driver.findElement(By.id("userid"));
		
		WebElement passwordfield = driver.findElement(By.id("password"));
		
		WebElement loginbutton = driver.findElement(By.xpath("//button[@type='submit']"));
		useridfield.sendKeys(userid);
		passwordfield.sendKeys(password);
		loginbutton.click();
		Thread.sleep(2000);

		WebElement pinfield = driver.findElement(By.id("pin"));
		WebElement continuebutton= driver.findElement(By.xpath("//button[@type='submit']"));
		
		pinfield.sendKeys(pinid);
		continuebutton.click();
		Thread.sleep(2000);
		
		WebElement myid = driver.findElement(By.xpath("//span[@class='user-id']"));
		String actualtext = myid.getText();
		String expectedtext = userid;
		if(actualtext.equals(expectedtext)) {
			System.out.println("text is match tc is passed");
		}
		else {
			System.out.println("text is not matched tc is failed");
		}
		myid.click();
		Thread.sleep(2000);
		
		WebElement logout = driver.findElement(By.xpath("//a[@target='_self']"));
		logout.click();
		Thread.sleep(2000);
		WebElement userchange = driver.findElement(By.xpath("//a[text()='Change user']"));
		userchange.click();
		}
		 
		driver.quit();
		Thread.sleep(2000);
		}

}
