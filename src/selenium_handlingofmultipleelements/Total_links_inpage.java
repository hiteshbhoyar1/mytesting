package selenium_handlingofmultipleelements;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Total_links_inpage {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Testing\\automation\\velocity\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		List<WebElement> totallinks = driver.findElements(By.tagName("a"));
		System.out.println("the total number are links are "+totallinks.size());
		
	//	for getting the text of the links we have 4 methods which are used in the collections 
		for(WebElement w:totallinks) {
			System.out.println(w.getText());
		}
//		Iterator<WebElement> it = totallinks.iterator();
//		while(it.hasNext()) {
//			System.out.println(it.next());
//		}
//		for(int i=0;i<=totallinks.size()-1;i++) {
//			System.out.println(totallinks.get(i));
//		}

	}

}
