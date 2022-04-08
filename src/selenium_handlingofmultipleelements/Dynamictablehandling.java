package selenium_handlingofmultipleelements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamictablehandling {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Testing\\automation\\velocity\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.cricbuzz.com/cricket-series/3202/icc-womens-world-cup-2022/stats/?statsType=mostWickets&seriesType=&seriesId=3202");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		 WebElement next = driver.findElement(By.xpath("//a[text()=' Best Batting Average ']"));
		 next.click();
		List<WebElement> header = driver.findElements(By.xpath("//table[@class='table table-responsive cb-series-stats']//tr[1]//th"));
		System.out.println(header.size());
		int totalcolumns = header.size()-2;
		List<WebElement> rows = driver.findElements(By.xpath("//table[@class='table table-responsive cb-series-stats']//tr"));
		System.out.println(rows.size());
		int totalrows = rows.size();Thread.sleep(1000);
		for(int i=1;i<=totalrows-1;i++) {
			String text;
			for(int j=1;j<=totalcolumns;j++) {
				if(i==1) {
					 text = driver.findElement(By.xpath("//table[@class='table table-responsive cb-series-stats']//tr["+i+"]//th["+j+"]")).getText();
					System.out.print(text+"||");
				}
				else {Thread.sleep(1000);
					 text = driver.findElement(By.xpath("//table[@class='table table-responsive cb-series-stats']//tr["+i+"]//td["+j+"]")).getText();
					System.out.print(text+"||");
				}
				
			}
			System.out.println();
			
		}
		
		
	
	}

}
