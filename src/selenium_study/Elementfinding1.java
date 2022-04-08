package selenium_study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Elementfinding1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Testing\\automation\\velocity\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.instagram.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(200);
		WebElement webele1 = driver.findElement(By.xpath("//input[@name='username']"));
		webele1.sendKeys("898370");
		Thread.sleep(2000);
		webele1.clear();
		
	
		}

}
