package selenium_study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Listboxuse {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Testing\\automation\\velocity\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		Thread.sleep(2000);
		
		WebElement dropdown = driver.findElement(By.id("day"));
		Select s= new Select(dropdown);
		s.selectByIndex(3);
		Thread.sleep(2000);
		s.selectByValue("6");
		Thread.sleep(2000);
		s.selectByVisibleText("20");
		Thread.sleep(2000);
		
		WebElement dropdown1 = driver.findElement(By.id("month"));
		Select s1= new Select(dropdown1);
		Thread.sleep(1000);
		s1.selectByIndex(4);
		Thread.sleep(2000);
		s1.selectByValue("9");
		Thread.sleep(2000);
		s1.selectByVisibleText("Oct");
		Thread.sleep(2000);
		
		WebElement dropdown2 = driver.findElement(By.id("year"));
		Select s2= new Select(dropdown2);
		s2.selectByIndex(28);
		Thread.sleep(2000);
		s2.selectByValue("1990");
		Thread.sleep(2000);
		s2.selectByVisibleText("2002");
		
		


	}

}
