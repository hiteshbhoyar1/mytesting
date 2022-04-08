package selenium_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Radiobutton {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Testing\\automation\\velocity\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.get("https://vctcpune.com/selenium/practice.html");
	    driver.manage().window().maximize();
	    Thread.sleep(2000);
	    WebElement radiobutton1 = driver.findElement(By.xpath("//input[@value='Radio1']"));
//	    Actions act= new Actions(driver);
//	    act.moveToElement(radiobutton1).click().build().perform();
	    JavascriptExecutor js = (JavascriptExecutor)driver;
	    js.executeScript("arguments[0].scrollIntoView();",radiobutton1);
	    Thread.sleep(2000);
	    radiobutton1.click();
	}

}
