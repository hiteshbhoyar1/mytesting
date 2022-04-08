package selenium_handlingofmultipleelements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamictable_handle {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "D:\\Testing\\automation\\velocity\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		List<WebElement> numberofcolumn = driver.findElements(By.xpath(" //table[@id='customers']//tr[1]//th"));
		System.out.println("the number of column are "+numberofcolumn.size());
		int columndata = numberofcolumn.size();
		
		List<WebElement> numberofrow = driver.findElements(By.xpath(" //table[@id='customers']//tr"));
		System.out.println("the number of rows are "+numberofrow.size());
		int rowdata = numberofrow.size();
		
		//outer loop for row and inner for loop for column
		for(int i=1;i<=rowdata;i++) {
			String text;
			for(int j=1;j<=columndata;j++) {
				if(i==1) {
				text= driver.findElement(By.xpath(" //table[@id='customers']//tr["+i+"]//th["+j+"]")).getText();
				}
				else {
					text = driver.findElement(By.xpath(" //table[@id='customers']//tr["+i+"]//td["+j+"]")).getText();
					System.out.print(text+" ||");	
				}
			}System.out.println();
		}
		
		
		

	}


	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
