package selenium_popupstudy;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Childbrowser_popup {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Testing\\automation\\velocity\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://skpatro.github.io/demo/links/");
		Thread.sleep(2000);
		
		String mainpagewindowID = driver.getWindowHandle();//it will give the window id in string form
		System.out.println("the window id is "+mainpagewindowID);
		Thread.sleep(2000);
		
		driver.findElement(By.name("NewWindow")).click(); //it will open the child browser popup
		Thread.sleep(2000);
		//in this we got multiple window
		Set<String> allwindowsIDs = driver.getWindowHandles();
		System.out.println("all ids are "+allwindowsIDs);
		
		Iterator<String> it = allwindowsIDs.iterator(); //it will point to -1 position
		String mainpageID = it.next(); // it will point to 0th position
		String childpageID = it.next();// it will point to 1st position
		
		//switch the selenium focus to child page
		Thread.sleep(2000);
		driver.switchTo().window(childpageID);//focused shift from main page to child page
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='the7-search']")).sendKeys("selenium");
		Thread.sleep(5000);
		driver.close();
		
		//then switch focus to main page
		driver.switchTo().window(mainpageID);
		Thread.sleep(2000);
		driver.findElement(By.name("home")).click();
		Thread.sleep(3000);
		driver.close();
		


	}

}
