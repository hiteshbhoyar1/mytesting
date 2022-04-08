package selenium_handlingofmultipleelements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selectiongmultiplecheckbox_study {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Testing\\automation\\velocity\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@type='checkbox']"));
		
		//here also we are going to use for each loop 
		for(WebElement w:checkboxes) {
			Thread.sleep(2000);
			w.click();
		}
		//for unselect all we are going to follow the same method 
		for(WebElement w:checkboxes) {
			Thread.sleep(2000);
			w.click();
		}
	}

}
