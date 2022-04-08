package selenium_study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Is_displaystudy {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Testing\\automation\\velocity\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement textbox = driver.findElement(By.id("displayed-text"));
		Thread.sleep(2000);
		boolean result=textbox.isDisplayed();
		System.out.println("text box status is "+result);
		Thread.sleep(2000);
		WebElement hidebutton = driver.findElement(By.id("hide-textbox"));
		hidebutton.click();
		Thread.sleep(2000);
		boolean result1=textbox.isDisplayed();
		System.out.println(result1);

	}

}
