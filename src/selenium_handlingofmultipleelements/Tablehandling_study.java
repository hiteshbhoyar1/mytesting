package selenium_handlingofmultipleelements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tablehandling_study {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Testing\\automation\\velocity\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		List<WebElement> tableheader = driver.findElements(By.xpath("//table[@id='product']//th"));
		for(WebElement w:tableheader) {
			System.out.print(w.getText()+" ||");
		}
		System.out.println();
		for(int i=2;i<=11;i++) {
			System.out.println();
		List<WebElement> tablerow = driver.findElements(By.xpath("(//table[@id='product']//tr)["+i+"]//td"));
		for(WebElement w1:tablerow)
		{
			System.out.print(w1.getText()+" ||");
		}
		}
	}

}
