package selenium_study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Is_enabled {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Testing\\automation\\velocity\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.discoveryplus.in/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement signinbutton=driver.findElement(By.xpath("(//h6[text()='Sign In'])[2]"));
		Thread.sleep(2000);
		signinbutton.click();
		Thread.sleep(2000);
		WebElement getotpbutton=driver.findElement(By.xpath("//button[text()='Get OTP']"));
		//getotpbutton.isEnabled();
		boolean result= getotpbutton.isEnabled();
		System.out.println(result);
		if(result) {
			System.out.println("Get OTP button is Enabled");
			getotpbutton.isEnabled();
			
		}
		else {
			driver.findElement(By.id("mobileNumber")).sendKeys("8983708744");
			Thread.sleep(2000);
			getotpbutton.click();
			System.out.println("click on the get otp button");
		}
		
		

	}

}
