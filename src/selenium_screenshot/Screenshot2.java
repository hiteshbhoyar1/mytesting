package selenium_screenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class Screenshot2 {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "D:\\Testing\\automation\\velocity\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String s = RandomString.make(2);
		File dest= new File("D:\\screenshot\\mycode"+s+".png");
		
		FileHandler.copy(src, dest);
		driver.close();
	}

}
