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

public class Zeroda_withDDF_use {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		FileInputStream myfile = new FileInputStream("D:\\poi-bin-5.2.1-20220224\\sheet2.xlsx");
		Sheet sheet = WorkbookFactory.create(myfile).getSheet("sheet4");
		String UserName = sheet.getRow(0).getCell(0).getStringCellValue();
		String Password = sheet.getRow(0).getCell(1).getStringCellValue();
		String Pin = sheet.getRow(0).getCell(2).getStringCellValue();
		
		
		  System.setProperty("webdriver.chrome.driver", "D:\\Testing\\automation\\velocity\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver= new ChromeDriver();
			driver.get("https://kite.zerodha.com/");
			Thread.sleep(2000);
			driver.manage().window().maximize();
			WebElement UserNameField = driver.findElement(By.id("userid"));
			WebElement PasswordField = driver.findElement(By.id("password"));
			WebElement Loginbutton = driver.findElement(By.xpath("//button[@type='submit']"));
		   
		   UserNameField.sendKeys(UserName);
		   PasswordField.sendKeys(Password);
		   Loginbutton.click();
		   Thread.sleep(2000);
		   WebElement PinField = driver.findElement(By.id("pin"));
		   WebElement ContinueButton = driver.findElement(By.xpath("//button[@type='submit']"));
		   PinField.sendKeys(Pin);
		   ContinueButton.click();
		   
		   Thread.sleep(2000);
		   WebElement MyID = driver.findElement(By.xpath("//span[@class='user-id']"));
		   String Actualtext = MyID.getText();
		   String ExpectedID = UserName;
		   if(Actualtext.equals(ExpectedID)) {
			   System.out.println("user id is matching test case is pass");
		   }
		   else {
			   System.out.println("user id is not matching test case fail");
		   }
		   MyID.click();
		   WebElement LogoutLink = driver.findElement(By.xpath("//a[@target='_self']"));
		   LogoutLink.click();
		   Thread.sleep(5000);
		   driver.quit();
		   
		   
		
		
	}

}
