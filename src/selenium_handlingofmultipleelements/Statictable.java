package selenium_handlingofmultipleelements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Statictable {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Testing\\automation\\velocity\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		List<WebElement> header = driver.findElements(By.xpath("//table[@id='customers']//tr[1]//th"));
		System.out.println(header.size());
		
		for(WebElement w:header) {
			System.out.print(w.getText()+"||");
		}
		System.out.println();
		for(int i=2;i<=18;i++) {
			
			List<WebElement> rows = driver.findElements(By.xpath("//table[@id='customers']//tr["+i+"]//td"));
			for(WebElement w:rows) {
			System.out.print(w.getText()+"||");
			}
			System.out.println();
			}
		
	}

}
