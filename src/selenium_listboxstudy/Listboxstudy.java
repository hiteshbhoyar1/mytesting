package selenium_listboxstudy;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Listboxstudy {
	

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Testing\\automation\\velocity\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement dropdown = driver.findElement(By.xpath("//select[@name='dropdown-class-example']"));
	//	Actions a = new Actions(driver);
//		a.moveToElement(dropdown).perform();
		 JavascriptExecutor js = (JavascriptExecutor)driver;
		 js.executeScript("arguments[0].scrollIntoView();",dropdown);
		Thread.sleep(2000);
		 Select s = new Select(dropdown);
		 s.selectByIndex(0);Thread.sleep(2000);
		 s.selectByValue("option2");Thread.sleep(2000);
		 s.selectByVisibleText("Option3");Thread.sleep(2000);
		List<WebElement> list = driver.findElements(By.tagName("*"));
		System.out.println(list.size());
		
	}

}
