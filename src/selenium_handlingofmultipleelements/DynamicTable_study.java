package selenium_handlingofmultipleelements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicTable_study {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Testing\\automation\\velocity\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		List<WebElement> columncount = driver.findElements(By.xpath("//table[@id='product']//tr[1]//th"));
		System.out.println("the total numbers of columns are "+columncount.size());
		int totalcolumns = columncount.size();
		
		List<WebElement> rowcount = driver.findElements(By.xpath("//table[@id='product']//tr"));
		System.out.println("the total number of row are "+rowcount.size());
		int totalrows = rowcount.size();
		
		//outer for loop is for rows and inner for loop is for column
		for(int i=1;i<=totalrows;i++) {
			String text;
			for(int j=1;j<=totalcolumns;j++) {
				
				if(i==1) {
					text= driver.findElement(By.xpath("//table[@id='product']//tr["+i+"]//th["+j+"]")).getText();
					
				}
				else {
					text=driver.findElement(By.xpath("//table[@id='product']//tr["+i+"]//td["+j+"]")).getText();
					System.out.print(text+" || ");
				}
				
				
			}
			System.out.println();
		}
		
		
	}

}
