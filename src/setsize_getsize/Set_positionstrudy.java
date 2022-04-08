package setsize_getsize;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Set_positionstrudy {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Testing\\automation\\velocity\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com");
		Thread.sleep(2000);
		Point defaultposition = driver.manage().window().getPosition();
		System.out.println("the default position of the browser is "+defaultposition);
		Thread.sleep(2000);
		//to change the position of the browser we have to create the object of the point class which accept
		Point p= new Point(100, 30);
	    driver.manage().window().setPosition(p);
	    Dimension d=new Dimension(500, 300);
	     driver.manage().window().setSize(d);
	     System.out.println(driver.manage().window().getSize());
	    
	}

}
