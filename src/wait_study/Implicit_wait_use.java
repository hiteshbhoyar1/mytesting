package wait_study;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Implicit_wait_use {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Testing\\automation\\velocity\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://kite.zerodha.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		WebElement UserId = driver.findElement(By.id("userid"));
		UserId.sendKeys("HD5857");
		//driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		WebElement Password = driver.findElement(By.id("password"));
		Password.sendKeys("Ajinkya@123");
		//driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		WebElement LogInButton = driver.findElement(By.xpath("//button[@type='submit']"));
		LogInButton.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		WebElement Pin = driver.findElement(By.id("pin"));
		Pin.sendKeys("969696");
		//driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		WebElement ContinueButton = driver.findElement(By.xpath("//button[@type='submit']"));
		ContinueButton.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		WebElement USERID = driver.findElement(By.xpath("//span[@class='user-id']"));
		USERID.click();
		//driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		WebElement LogOutButton = driver.findElement(By.xpath("//a[@target='_self']"));
		LogOutButton.click();
	//	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		driver.quit();
		

	}

}
