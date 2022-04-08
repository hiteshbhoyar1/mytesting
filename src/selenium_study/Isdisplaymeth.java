package selenium_study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Isdisplaymeth {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Testing\\automation\\velocity\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver(); 
		driver.get("https://vctcpune.com/selenium/practice.html");
		Thread.sleep(1000);
		WebElement textbox = driver.findElement(By.id("displayed-text"));
		Thread.sleep(1000);
		boolean result = textbox.isDisplayed();
		System.out.println("the textbox status is "+result);
		Thread.sleep(2000);
		WebElement hidebutton = driver.findElement(By.id("hide-textbox"));
		hidebutton.click();
		Thread.sleep(10000);
		boolean result1=textbox.isDisplayed();
		System.out.println(result1);
		
	}

}
