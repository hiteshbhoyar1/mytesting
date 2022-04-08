package selenium_frame;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Nested_frames {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Testing\\automation\\velocity\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.get("http://demo.automationtesting.in/Frames.html");
	    driver.manage().window().maximize();
	    Thread.sleep(2000);
	  driver.findElement(By.xpath("//a[text()='Single Iframe ']")).click();
	  driver.switchTo().frame("singleframe");
	  driver.findElement(By.xpath("//input[@type='text']")).sendKeys("hitesh");
	  driver.switchTo().defaultContent();
	  driver.findElement(By.xpath("//a[text()='Iframe with in an Iframe']")).click();
	 WebElement outerframe = driver.findElement(By.xpath("//iframe[@style='float: left;height: 300px;width:600px']"));
	 driver.switchTo().frame(outerframe);
	 WebElement innerframe = driver.findElement(By.xpath("//iframe[@style='float: left;height: 250px;width: 400px']"));
	 driver.switchTo().frame(innerframe);
	 driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("chaman kr diya be ");
	 
	 
	 
	 
	 
	 
	}

}
