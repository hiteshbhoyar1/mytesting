package selenium_practice;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class Screenshotstudy {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","D:\\Testing\\automation\\velocity\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com/");
		Thread.sleep(2000);
		File str = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String s = RandomString.make(2);
		File dest=new File("D:\\screenshot\\mysc"+s+".jpg");
		FileHandler.copy(str, dest);
	}

}
