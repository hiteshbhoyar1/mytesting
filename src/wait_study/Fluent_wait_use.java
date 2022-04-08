package wait_study;

import java.time.Duration;
import java.util.Collection;

import org.openqa.selenium.By;import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Fluent_wait_use {

	

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Testing\\automation\\velocity\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.discoveryplus.in/");
		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(4000));
		WebElement SignInButton = driver.findElement(By.xpath("(//h6[text()='Sign In'])[2]"));
		SignInButton.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		 WebElement GetotpButton = driver.findElement(By.xpath("//button[@type='submit']"));
		 //fluent wait
	     FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver);
	    wait.withTimeout(Duration.ofMillis(1000));
	  
	  
	    		 
		WebElement enterMobileNO = driver.findElement(By.id("mobileNumber"));
	     enterMobileNO.sendKeys("8983708744");
	    wait.pollingEvery(Duration.ofMillis(100));
	     wait.until(ExpectedConditions.visibilityOf(GetotpButton));
//	     driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
	    
//	     WebDriverWait w= new WebDriverWait(driver, Duration.ofMillis(2000));
//	     w.until(ExpectedConditions.visibilityOf(GetotpButton));
	     
	    
	     
	     GetotpButton.click();
	     driver.quit();
	}
}
