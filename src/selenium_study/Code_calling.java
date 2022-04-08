package selenium_study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Code_calling {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Testing\\automation\\velocity\\chromedriver_win32\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("ahysd@gamil.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='email']")).clear();
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("1236589");
		driver.findElement(By.xpath("//button[@id='loginbutton']")).click();
	}

}
