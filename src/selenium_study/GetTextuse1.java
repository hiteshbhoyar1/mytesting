package selenium_study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextuse1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Testing\\automation\\velocity\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement webele=driver.findElement(By.xpath("//h2[contains(text(),'Facebook helps you connect and')]"));
		Thread.sleep(2000);
		String actualtext =webele.getText();
		String expectedtext = "Facebook helps you connect and share with the people in your life.";
		
		if(actualtext.equals(expectedtext)) {
			System.out.println("the text is match hence testcase is pass");
		}
		else {
			System.out.println("the text is not match hence testcase is fail");
		}
		


	}

}
