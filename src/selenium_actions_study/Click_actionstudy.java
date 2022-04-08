package selenium_actions_study;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Click_actionstudy {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Testing\\automation\\velocity\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
     	driver.get("https://vctcpune.com/selenium/practice.html");
      	driver.manage().window().maximize();
      	Thread.sleep(2000);
      	WebElement checkboxoption1 = driver.findElement(By.id("checkBoxOption1"));
      	JavascriptExecutor js = (JavascriptExecutor)driver;
      	js.executeScript("arguments[0].scrollIntoView();",checkboxoption1);
      	Thread.sleep(2000);
      	//to use the actions class we need to create the object of the actions class
      	Actions act= new Actions(driver);
   //  	act.click(checkboxoption1).perform();
      	//another way is 
      	act.moveToElement(checkboxoption1).click().build().perform();
      	

	}

}
