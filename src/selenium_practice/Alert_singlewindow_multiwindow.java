package selenium_practice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_singlewindow_multiwindow {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Testing\\automation\\velocity\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.get("http://demo.automationtesting.in/Alerts.html");
	    driver.manage().window().maximize();
	    Thread.sleep(2000);
	    WebElement button = driver.findElement(By.xpath("(//a[@data-toggle='tab'])[1]"));
	    button.click();
	    WebElement button1 = driver.findElement(By.xpath("//button[@onclick='alertbox()']"));
	    button1.click();
	    Alert alertbutton = driver.switchTo().alert();
	    alertbutton.accept();
	    Thread.sleep(2000);
	    WebElement button2 = driver.findElement(By.xpath("//a[text()='Alert with OK & Cancel ']"));
	    button2.click();
	    WebElement button3 = driver.findElement(By.xpath("//button[text()='click the button to display a confirm box ']"));
	    button3.click();
	    Alert alertbutton1 = driver.switchTo().alert();
	    alertbutton1.accept();
	    WebElement button4 = driver.findElement(By.xpath("//a[text()='Alert with Textbox ']"));
	    button4.click();
	    WebElement button5 = driver.findElement(By.xpath("//button[text()='click the button to demonstrate the prompt box ']"));
        button5.click();
       Alert alertbtn = driver.switchTo().alert();
       System.out.println(alertbtn.getText());
       alertbtn.accept();
	
	}

}
