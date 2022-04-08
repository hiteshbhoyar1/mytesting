package selenium_popupstudy;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertpopup {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Testing\\automation\\velocity\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		Thread.sleep(1000);
	    WebElement clickmebutton = driver.findElement(By.id("confirmButton"));
	    clickmebutton.click();
	    Alert alt = driver.switchTo().alert();
	    String textonalertpopup= alt.getText();
	    System.out.println("text of alert popup is "+textonalertpopup);
	    
	    alt.accept();
	    Thread.sleep(2000);
		WebElement clickmebutton1 = driver.findElement(By.id("promtButton"));
		clickmebutton1.click();
		Alert alt1 = driver.switchTo().alert();
		String texton = alt1.getText();
		System.out.println("text on alert pop up is "+texton);
		alt1.accept();
		Thread.sleep(2000);
		driver.close();
		
		
	}

}
