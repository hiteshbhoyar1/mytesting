package selenium_scrollstudy;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScroolI_Into_View {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Testing\\automation\\velocity\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html");
		Thread.sleep(3000);
		WebElement checkboxoption1 = driver.findElement(By.id("checkBoxOption1"));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();",checkboxoption1);
		Thread.sleep(3000);
		checkboxoption1.click();
		

	}

}
