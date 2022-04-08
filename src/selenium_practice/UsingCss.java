package selenium_practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingCss {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Testing\\automation\\velocity\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.get("https://www.cricbuzz.com/");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
	    WebElement home = driver.findElement(By.cssSelector("a[title='IPL 2022 Home']"));
	    home.click();
	    driver.findElement(By.cssSelector("a[title='IPL 2022 Stats']")).click();
	   WebElement table = driver.findElement(By.cssSelector("table[class='table table-responsive cb-series-stats']"));
	   String text = table.getText();
	   System.out.println(text);
	    
	}

}
