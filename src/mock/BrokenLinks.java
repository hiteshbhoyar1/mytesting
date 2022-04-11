package mock;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "D:\\Testing\\automation\\velocity\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		int count=0;
		List<WebElement> links = driver.findElements(By.tagName("a"));
		
		System.out.println(links.size());
		
		for(int i=0;i<links.size();i++) {
			WebElement element = links.get(i);
			String url = element.getAttribute("href");
			URL link= new URL(url); 
			HttpURLConnection httpconn=(HttpURLConnection) link.openConnection();
			httpconn.connect();
			int respcode = httpconn.getResponseCode();
			if(respcode==400) {
				System.out.println(url+" "+"is invalid link");
				count++;
			}
			else {
				System.out.println(url+" "+"is valid links");
			}
		}
		System.out.println(count);

	}

}
