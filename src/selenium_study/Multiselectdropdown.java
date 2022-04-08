package selenium_study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multiselectdropdown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Testing\\automation\\velocity\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/select-menu");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement multidropdown = driver.findElement(By.id("cars"));
		Select s = new Select(multidropdown);
		Thread.sleep(2000);
		s.selectByIndex(0);
		Thread.sleep(2000);
		s.selectByValue("opel");
		Thread.sleep(2000);
		s.selectByVisibleText("Audi");
	}

}
