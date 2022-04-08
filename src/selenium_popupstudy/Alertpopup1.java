package selenium_popupstudy;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertpopup1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Testing\\automation\\velocity\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		Thread.sleep(1000);
		WebElement clickmebutton = driver.findElement(By.id("confirmButton"));
		clickmebutton.click();
		Thread.sleep(2000);
		Alert alt = driver.switchTo().alert();
		String textonalertpopup=alt.getText();
		System.out.println("the text on alert pop up is "+textonalertpopup);
		Thread.sleep(2000);
		alt.accept();
		driver.close();
	}

}
