package selenium_study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Is_selected_use {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Testing\\automation\\velocity\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement option1checkbox =driver.findElement(By.id("checkBoxOption1"));
		boolean result = option1checkbox.isSelected();
		
		if(result) {
			System.out.println("checkbox is already selected");
		}
		else {
			System.out.println("check box is not selected, selecting checkbox now");
			option1checkbox.click();
			Thread.sleep(2000);
			boolean result2 = option1checkbox.isSelected();
			System.out.println("updated checkbox selected status is "+result2);
		}
		
	}

}
