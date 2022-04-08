package selenium_scrollstudy;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll_study2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Testing\\automation\\velocity\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement checkboxoption3 = driver.findElement(By.id("checkBoxOption3"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,290)");
		Thread.sleep(2000);
		
		checkboxoption3.click();
	}

}
