package selenium_excelstudy;


import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zerodha_withoutDDF {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
	
	   System.setProperty("webdriver.chrome.driver", "D:\\Testing\\automation\\velocity\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://kite.zerodha.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		WebElement UserNameField = driver.findElement(By.id("userid"));
		WebElement PasswordField = driver.findElement(By.id("password"));
		WebElement Loginbutton = driver.findElement(By.xpath("//button[@type='submit']"));
	   
	   UserNameField.sendKeys("HD5857");
	   PasswordField.sendKeys("Ajinkya@123");
	   Loginbutton.click();
	   Thread.sleep(2000);
	   WebElement PinField = driver.findElement(By.id("pin"));
	   WebElement ContinueButton = driver.findElement(By.xpath("//button[@type='submit']"));
	   PinField.sendKeys("969696");
	   ContinueButton.click();
	   
	   Thread.sleep(2000);
	   WebElement MyID = driver.findElement(By.xpath("//span[@class='user-id']"));
	   String Actualtext = MyID.getText();
	   String ExpectedID = "HD5857";
	   if(Actualtext.equals(ExpectedID)) {
		   System.out.println("user id is matching test case is pass");
	   }
	   else {
		   System.out.println("user id is not matching test case fail");
	   }
	   MyID.click();
	   WebElement LogoutLink = driver.findElement(By.xpath("//a[@target='_self']"));
	   LogoutLink.click();
	   driver.close();
	   
	   
	}

}
