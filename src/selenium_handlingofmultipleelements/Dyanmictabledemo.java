package selenium_handlingofmultipleelements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dyanmictabledemo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Testing\\automation\\velocity\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://cosmocode.io/automation-practice-webtable/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		List<WebElement> columns = driver.findElements(By.xpath("//table[@id='countries']//tr[1]//h3"));
		System.out.println(columns.size());
		int cdata = columns.size();
		
		List<WebElement> rows = driver.findElements(By.xpath("//table[@id='countries']//tr"));
		System.out.println(rows.size());
		int rdata = rows.size();
		for(WebElement w:columns) {
			System.out.print(w.getText()+"||");
		}System.out.println();
		for(int i=2;i<=rdata;i++) {
			String text;
			for(int j=1;j<=cdata;j++) {
				
					text=driver.findElement(By.xpath("//table[@id='countries']//tr["+i+"]//td["+j+"]")).getText();
				System.out.print(text+"||");
				}System.out.println();
			}
			
		}
	}


