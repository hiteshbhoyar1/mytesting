package selenium_study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Code_get {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Testing\\automation\\velocity\\chromedriver_win32\\chromedriver.exe");
		WebDriver drive= new ChromeDriver();
		drive.get("https://www.instagram.com/?hl=en");
		Thread.sleep(2000);
		drive.findElement(By.xpath("//a[@data-testid='sign-up-link']")).click();
		Thread.sleep(2000);
		drive.findElement(By.xpath("//input[@name='emailOrPhone']")).sendKeys("hitesh1254@gmail.com");
		Thread.sleep(2000);
		drive.findElement(By.xpath("//input[@name='fullName']")).sendKeys("hite g bahoy");
		Thread.sleep(2000);
		drive.findElement(By.xpath("//input[@name='username']")).sendKeys("hellboy000120");
		Thread.sleep(2000);
		drive.findElement(By.xpath("//input[@name='password']")).sendKeys("hits@123654");
		Thread.sleep(2000);
		drive.findElement(By.xpath("//button[@type='submit']")).click();

	}

}
