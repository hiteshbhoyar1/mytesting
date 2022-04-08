package selenium_handlingofmultipleelements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamictable_study1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Testing\\automation\\velocity\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.cricbuzz.com/cricket-series/3202/icc-womens-world-cup-2022/stats");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		List<WebElement> numberofcolumn = driver.findElements(By.xpath(" //table[@class='table table-responsive cb-series-stats']//tr[1]//th"));
		System.out.println("the number of column are "+numberofcolumn.size());
		int columndata = numberofcolumn.size();
		
		List<WebElement> numberofrow = driver.findElements(By.xpath(" //table[@class='table table-responsive cb-series-stats']//tr"));
		System.out.println("the number of rows are "+numberofrow.size());
		int rowdata = numberofrow.size()-1;
		
		List<WebElement> header = driver.findElements(By.xpath("//table[@class='table table-responsive cb-series-stats']//tr[1]//th"));
		for(WebElement w:header) {
			System.out.print(w.getText()+" || ");
		}
		 System.out.println();
		
		//outer loop for row and inner for loop for column
		for(int i=1;i<=rowdata;i++) {
			String text;
			for(int j=1;j<=columndata;j++) {
				
					text = driver.findElement(By.xpath("//table[@class='table table-responsive cb-series-stats']//tr["+i+"]//td["+j+"]")).getText();
					System.out.print(text+" ||");	
				
			}System.out.println();
		}
		
		
		

	}

}
