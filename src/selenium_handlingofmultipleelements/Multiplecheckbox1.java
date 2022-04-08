package selenium_handlingofmultipleelements;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multiplecheckbox1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Testing\\automation\\velocity\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		List<WebElement> allcheckbox = driver.findElements(By.xpath("//input[@type='checkbox']"));
	    Iterator<WebElement> it = allcheckbox.iterator();
	    while(it.hasNext()) {
	    	Thread.sleep(2000);
	    	it.next().click();
	    }
	    Iterator<WebElement> itr = allcheckbox.iterator();
	    while(itr.hasNext()) {
	    	Thread.sleep(2000);
	    	itr.next().click();
	    }
	    for(WebElement w:allcheckbox) {
	    	w.click();
	    }
	    
	    }
	}


