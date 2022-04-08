package selenium_practice;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames_windows {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Testing\\automation\\velocity\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
//	    driver.get("http://demo.automationtesting.in/Windows.html");
//	    driver.manage().window().maximize();
//	    Thread.sleep(2000);
//	   WebElement newwindow = driver.findElement(By.xpath("//a[text()='Open New Tabbed Windows ']"));
//	   newwindow.click();
//	   WebElement newwindow1 = driver.findElement(By.xpath("//button[text()='    click   ']"));
//	   newwindow1.click();
//	    Set<String> allwindowids = driver.getWindowHandles();
//	    Iterator<String> it = allwindowids.iterator();
//	    String mainpageid = it.next();
//	    String childpageid = it.next();
//	    driver.switchTo().window(childpageid);
//	    Thread.sleep(2000);
//	    WebElement inputsearch = driver.findElement(By.xpath("//input[@type='search']"));
//	    inputsearch.sendKeys("Selenium"); Thread.sleep(2000);
//	    driver.close();
//	    driver.switchTo().window(mainpageid);
//	    WebElement sepwindow = driver.findElement(By.xpath("//a[text()='Open New Seperate Windows']"));
//	    sepwindow.click();
//	    WebElement sepwindow1 = driver.findElement(By.xpath("//button[text()='click']"));
//	    sepwindow1.click(); Thread.sleep(2000);
//	    Set<String> windowidsall = driver.getWindowHandles();
//	    Iterator<String> itr = windowidsall.iterator();
//	    String mainid = itr.next();
//	    String cb1 = itr.next();
//	    driver.switchTo().window(cb1);
//	    driver.manage().window().maximize();
//	    Thread.sleep(2000);
//	    WebElement newinput = driver.findElement(By.xpath("//input[@type='search']"));
//	    newinput.sendKeys("dil se bolo delhi");
//	    Thread.sleep(2000);
//	    driver.close();
//	    driver.switchTo().window(mainid);
//	    Thread.sleep(2000);
//	    WebElement mulwindows = driver.findElement(By.xpath("//a[text()='Open Seperate Multiple Windows']"));
//	    mulwindows.click();
//	    Thread.sleep(2000);
//	   WebElement openmul = driver.findElement(By.xpath("//button[text()='click ']"));
//	   openmul.click();
//	   Thread.sleep(2000);
//	   Set<String> allids = driver.getWindowHandles();
//	   Iterator<String> ite = allids.iterator();
//	   String mnid = ite.next();
//	   String cb = ite.next();
//	   String cb2 = ite.next();
//	   driver.switchTo().window(cb);
//	   WebElement cbinput = driver.findElement(By.xpath("//input[@type='search']"));
//	   cbinput.sendKeys("har har mahadev");
//	   driver.close(); Thread.sleep(2000);
//	   driver.switchTo().window(cb2);
//	   WebElement cb2input = driver.findElement(By.xpath("//button[text()='Skip Sign In']"));
//	   cb2input.click();
//	   driver.close(); Thread.sleep(2000);
//	   driver.switchTo().window(mnid);
//	   driver.close();
//	   
//	   
//	   
//	   
//	   
//	   
//	   
//	    
//	    
//	    
//	    
//	    
//	    
//	    
//	    
//	    
//	    
//	    
//	    
//	    
//	    
//	    
	   

	}

}
