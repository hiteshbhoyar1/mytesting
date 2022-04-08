package selenium_listboxstudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Listbox_study1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Testing\\automation\\velocity\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(1000);
		driver.manage().window().maximize();
		WebElement regsbutton = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
		regsbutton.click();
		Thread.sleep(1000);
		WebElement firstname = driver.findElement(By.xpath("//input[@name='firstname']"));
		firstname.sendKeys("Hitesh");
		Thread.sleep(100);
	    WebElement lastname = driver.findElement(By.xpath("//input[@name='lastname']"));
	    lastname.sendKeys("Bhoyar");
	    Thread.sleep(100);
	    WebElement regemail = driver.findElement(By.xpath("//input[@name='reg_email__']"));
	    regemail.sendKeys("8983708744");
	    Thread.sleep(100);
	    WebElement regpasswd=driver.findElement(By.xpath("//input[@name='reg_passwd__']"));
	    regpasswd.sendKeys("hitesh123");
	    Thread.sleep(1000);
	    WebElement day = driver.findElement(By.xpath("//select[@id='day']"));
	    Select s= new Select(day);
	    s.selectByIndex(3); Thread.sleep(1000);
	    WebElement month=driver.findElement(By.xpath("//select[@id='month']"));
	    Select m= new Select(month);
	    m.selectByValue("5");
	    Thread.sleep(1000);
	    WebElement year=driver.findElement(By.xpath("//select[@id='year']"));
	    Select y= new Select(year);
	    y.selectByVisibleText("1994");
	    Thread.sleep(1000);
	    WebElement sex=driver.findElement(By.xpath("(//input[@name='sex'])[2]"));
	    sex.click();
	    Thread.sleep(1000);
	    WebElement sbutton=driver.findElement(By.xpath("//button[@name='websubmit']"));
	    sbutton.click();
	}

}
