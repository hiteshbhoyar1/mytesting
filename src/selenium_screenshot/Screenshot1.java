package selenium_screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class Screenshot1 {

	public static void main(String[] args) throws InterruptedException, IOException {	
		System.setProperty("webdriver.chrome.driver", "D:\\Testing\\automation\\velocity\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver= new ChromeDriver();
	    driver.get("https://gaana.com/");
	    driver.manage().window().maximize();
	    Thread.sleep(2000);
	    File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	    String s= RandomString.make(2);
	    File d= new File("D:\\screenshot\\screen"+s+".png");
	    FileHandler.copy(source, d);
	    

	}

}
