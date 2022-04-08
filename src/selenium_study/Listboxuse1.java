package selenium_study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Listboxuse1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Testing\\automation\\velocity\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		Thread.sleep(2000);
		WebElement webele = driver.findElement(By.xpath("//input[@onblur='fieldTrack(this);']"));
		webele.sendKeys("Hitesh Gopalrao Bhoyar");
		Thread.sleep(2000);
		WebElement dropdown1 = driver.findElement(By.xpath("(//select[@onchange='fieldTrack(this);'])[2]"));
		
		Select s = new Select(dropdown1);
		s.selectByIndex(4); Thread.sleep(2000);
		s.selectByValue("20"); Thread.sleep(2000);
		s.selectByVisibleText("08");
		
		WebElement webele2 = driver.findElement(By.xpath("(//select[@onchange=\"fieldTrack(this);\"])[3]"));
        Select m= new Select(webele2);
        m.selectByIndex(1);  Thread.sleep(2000);
        m.selectByValue("05"); Thread.sleep(2000);
        m.selectByVisibleText("JUN"); Thread.sleep(2000);
        
        WebElement webele3 = driver.findElement(By.xpath("(//select[@onchange=\"fieldTrack(this);\"])[4]"));
        Select y= new Select(webele3);
        y.selectByIndex(28);Thread.sleep(2000);
        y.selectByValue("1965");Thread.sleep(2000);
        y.selectByVisibleText("1973"); Thread.sleep(2000);
        
        
	}

}
