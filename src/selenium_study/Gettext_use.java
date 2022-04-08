package selenium_study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gettext_use {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Testing\\automation\\velocity\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement webel= driver.findElement(By.xpath("//h2[contains(text(),'Facebook helps you connect and s')]"));
		String Actualtext= webel.getText();
		String Expectedtext= "Facebook helps you connect and share with the people in your life.";
		if(Actualtext.equals(Expectedtext)) {
			System.out.println("text is match Test Case is passed");
		}
		else {
			System.out.println("Text is not match Test Case is failed");
			}
		
		
		
	}	

}
