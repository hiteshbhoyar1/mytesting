package selenium_popupstudy;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Childbrowser_study {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Testing\\automation\\velocity\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://skpatro.github.io/demo/links/");
		String mainwindowid = driver.getWindowHandle();
		System.out.println("the window id is "+mainwindowid);
		
		driver.findElement(By.name("NewWindow")).click();
		
		Set<String> allwindowids = driver.getWindowHandles();
		System.out.println("the all window id are "+allwindowids);
		
		Iterator<String> it = allwindowids.iterator();
		String mainpageid = it.next();
		String child = it.next();
		
		driver.switchTo().window(child);
		driver.manage().window().maximize();
		WebElement send = driver.findElement(By.xpath("//input[@id='the7-search']"));
		send.sendKeys("MOCK GROUP 11");
		driver.close();
		
		driver.switchTo().window(mainpageid);
		WebElement homebutton = driver.findElement(By.name("home"));
		homebutton.click();
		Thread.sleep(2000);
		driver.close();
		
	}

}
