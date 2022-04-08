package selenium_study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Elementfiding {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Testing\\automation\\velocity\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://kite.zerodha.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		driver.findElement(By.id("userid")).sendKeys("38457695");
		Thread.sleep(2000);
		driver.findElement(By.id("userid")).clear();
		
	}

}
