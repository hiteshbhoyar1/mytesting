package selenium_study;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Firstcode2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Testing\\automation\\velocity\\chromedriver_win32\\chromedriver.exe");
		WebDriver hitesh = new ChromeDriver();
		hitesh.get("https://www.facebook.com/login/");
		
		Thread.sleep(5000);
		hitesh.navigate().to("https://www.instagram.com/");
		Thread.sleep(5000);
		hitesh.manage().window().maximize();
		Thread.sleep(5000);
		//hitesh.manage().window().minimize();
		Thread.sleep(5000);
		hitesh.navigate().back();
		Thread.sleep(5000);
		hitesh.navigate().forward();
		System.out.println(hitesh.getTitle());
		
		

	}

}
