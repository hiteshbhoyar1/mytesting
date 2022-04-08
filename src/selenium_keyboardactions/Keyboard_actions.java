package selenium_keyboardactions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Keyboard_actions {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Testing\\automation\\velocity\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		
		Thread.sleep(2000);
		WebElement day = driver.findElement(By.id("day"));
		//we can perform by taking direct day.click and by using actions class
		//day.click();
		Actions act = new Actions(driver);
		act.click(day).perform();
		Thread.sleep(2000);
		for(int i=0;i<=18;i++) {
			act.sendKeys(Keys.ARROW_DOWN).perform();
		}
		Thread.sleep(2000);
		for(int i=0;i<=12;i++) {
			act.sendKeys(Keys.UP).perform();
		}
		act.sendKeys(Keys.ENTER).perform();
		
		

	}

}
