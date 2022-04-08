package selenium_actions_study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Context_clickstudy {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Testing\\automation\\velocity\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.get("https://demo.guru99.com/test/simple_context_menu.html");
	    Thread.sleep(2000);
	    driver.manage().window().maximize();
	    Thread.sleep(2000);
	    WebElement rightclickme = driver.findElement(By.xpath("//span[text()='right click me']"));
	    Actions act = new Actions(driver);
	  // act.contextClick(rightclickme).perform();
	    
	    //another way
	    act.moveToElement(rightclickme).contextClick().build().perform();
	}

}
