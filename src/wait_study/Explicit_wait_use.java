package wait_study;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicit_wait_use {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Testing\\automation\\velocity\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.discoveryplus.in/home?gclid=CjwKCAjwoduRBhA4EiwACL5RPycPAktDI9P9Cfofx_PQmHfzStwAVwYuK9amtDP3TWQAjVdmnp21ohoC44EQAvD_BwE");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		
		WebElement SignInButton = driver.findElement(By.xpath("(//h6[text()='Sign In'])[2]"));
		SignInButton.click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		
		WebElement sendNumber = driver.findElement(By.id("mobileNumber"));
		sendNumber.sendKeys("9999999999");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		
		WebElement getOTPButton = driver.findElement(By.xpath("//button[@type='submit']"));
		
		//to use the explicit wait we have to create the object of webdriverwait pass driver and time unit as arguments
		
		WebDriverWait w= new WebDriverWait(driver, Duration.ofMillis(2000));
		w.until(ExpectedConditions.visibilityOf(getOTPButton));
		getOTPButton.click();
		
		 

	}

}
