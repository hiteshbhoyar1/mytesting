package selenium_frame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Nested_framestudy1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Testing\\automation\\velocity\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://demoqa.com/nestedframes");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.switchTo().frame("frame1");
		WebElement parent = driver.findElement(By.xpath("//body[text()='Parent frame']"));
		System.out.println(parent.getText());
		WebElement childtext = driver.findElement(By.xpath("//iframe[@srcdoc='<p>Child Iframe</p>']"));
		driver.switchTo().frame(childtext);
		WebElement childframe = driver.findElement(By.xpath("//p[text()='Child Iframe']"));
		System.out.println(childframe.getText());
		driver.switchTo().parentFrame();
		System.out.println(parent.getText());
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[@class='text'])[15]")).click();
		
	}

}
