package selenium_study;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Firstcode {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Testing\\automation\\velocity\\chromedriver_win32\\chromedriver.exe");

		WebDriver hitesh= new ChromeDriver();
		hitesh.get("https://gaana.com/");
	}

}
