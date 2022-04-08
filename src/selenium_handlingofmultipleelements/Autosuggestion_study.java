package selenium_handlingofmultipleelements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggestion_study {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Testing\\automation\\velocity\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("q")).sendKeys("i phone 13 pro max");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
//		String ratings = driver.findElement(By.xpath("( //span[contains(text(),'Ratings')])[1]")).getText();
//		System.out.println(ratings);
		String ratings = driver.findElement(By.xpath("((//div[@class='_2kHMtA'])[1]//span)[6]")).getText();
		System.out.println("the ratings are "+ratings);
		
		
		
		}

}
