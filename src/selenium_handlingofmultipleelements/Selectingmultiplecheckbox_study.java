package selenium_handlingofmultipleelements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selectingmultiplecheckbox_study {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Testing\\automation\\velocity\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		List<WebElement> allbuttons = driver.findElements(By.tagName("button"));
		for(WebElement o:allbuttons) {
			System.out.println(o.getText());
		}
		List<WebElement> alldiv = driver.findElements(By.tagName("div"));
		for(WebElement o:alldiv) {
			System.out.println(o.getText());
		}
	}

}
