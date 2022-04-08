package setsize_getsize;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Set_sizestudy {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Testing\\automation\\velocity\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com");
		Thread.sleep(2000);
		Dimension defaultsize = driver.manage().window().getSize();
		System.out.println("the default size is "+defaultsize);
		Thread.sleep(10000);
		//for set size of the window we have to create object of dimension class which accept width and height
		Dimension d= new Dimension(800, 540);
		driver.manage().window().setSize(d);
		System.out.println(driver.manage().window().getSize());
	}

}
