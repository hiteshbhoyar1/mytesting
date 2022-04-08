package selenium_keyboardactions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Keyboard_actions1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Testing\\automation\\velocity\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		Thread.sleep(2000);
		WebElement firstname = driver.findElement(By.xpath("//input[@name='firstname']"));
		
		Actions act = new Actions(driver);
		act.keyDown(firstname,Keys.SHIFT).sendKeys("h").keyUp(Keys.SHIFT).sendKeys("itesh").build().perform();
		Thread.sleep(2000);
		
		WebElement lastname = driver.findElement(By.xpath("//input[@name='lastname']"));
		act.keyDown(lastname, Keys.SHIFT).sendKeys("b").keyUp(Keys.SHIFT).sendKeys("hoyar").build().perform();

	}

}
