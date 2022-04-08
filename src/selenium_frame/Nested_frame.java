package selenium_frame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Nested_frame {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Testing\\automation\\velocity\\chromedriver_win32\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/nestedframes");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.switchTo().frame("frame1");
		WebElement parenttext = driver.findElement(By.xpath("//body[text()='Parent frame']"));
		String Actualtext= parenttext.getText();
		String Expectedtext = "Parent frame";
		if(Actualtext.equals(Expectedtext)) {
			System.out.println("text is matching test case passed");
		}
		else {
			System.out.println("text is not matching test case is failed");
		}
		WebElement childframe = driver.findElement(By.xpath("//iframe[@srcdoc='<p>Child Iframe</p>']"));
		
		driver.switchTo().frame(childframe);
		WebElement childframe1 = driver.findElement(By.xpath("//p[text()='Child Iframe']"));
		String Actualtext1=childframe1.getText();
		String Expectedtext1= "Child Iframe";
		
		if(Actualtext1.equals(Expectedtext1)) {
			System.out.println("the text is matching test case is passed");
		}
		else {
			System.out.println("the text is not matching test case is failed");
		}
		Thread.sleep(2000);
	      driver.switchTo().parentFrame();
           System.out.println(parenttext.getText());
           driver.switchTo().defaultContent();
	}

}
