package selenium_study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Isenableduse1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Testing\\automation\\velocity\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.discoveryplus.in/");
		Thread.sleep(2000);
		WebElement webl =driver.findElement(By.xpath("(//h6[text()='Sign In'])[2]"));
		webl.click();
		Thread.sleep(2000);
		WebElement textbox = driver.findElement(By.id("show-textbox"));
		boolean result = textbox.isDisplayed();
		System.out.println("the status of textbox is "+result);
	}

}
