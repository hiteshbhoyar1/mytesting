package selenium_scrollstudy;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll_study {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Testing\\automation\\velocity\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,140)");
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(0,-50)");
		Thread.sleep(2000);
		WebElement conbutton = driver.findElement(By.id("confirmButton"));
		conbutton.click();
		Thread.sleep(2000);
		Alert alt = driver.switchTo().alert();
		alt.accept();
		

	}

}
