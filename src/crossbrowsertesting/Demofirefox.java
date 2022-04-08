package crossbrowsertesting;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Demofirefox {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "D:\\Testing\\automation\\velocity\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.get("https://vctcpune.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.close();
		
	}

}
