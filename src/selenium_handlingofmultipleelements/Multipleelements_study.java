package selenium_handlingofmultipleelements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multipleelements_study {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Testing\\automation\\velocity\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("honda");
		Thread.sleep(2000);
		List<WebElement> search = driver.findElements(By.xpath("//ul//li"));
		System.out.println(search.size());
		for(WebElement w:search) {
			String s=w.getText();
			System.out.println(s);
			if(s.equals("honda amaze")) {
				w.click();
				break;
			}
		}
		Thread.sleep(2000);
		driver.findElement(By.linkText("Images")).click();

	}

}
