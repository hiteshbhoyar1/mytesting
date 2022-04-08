package testNG_study;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNG_test1 {
  @Test
  public void f() {
		System.setProperty("webdriver.chrome.driver", "D:\\Testing\\automation\\velocity\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
     	driver.get("https://www.google.co.in/");
     	driver.manage().window().maximize();
  }
  @Test
  public void f1() {
	  System.setProperty("webdriver.chrome.driver", "D:\\Testing\\automation\\velocity\\chromedriver_win32\\chromedriver.exe");
	  WebDriver driver= new ChromeDriver();
	  driver.get("https://vctcpune.com/");
	  driver.manage().window().maximize();
  }
  @Test
  public void f2() {
	  System.setProperty("webdriver.chrome.driver", "D:\\Testing\\automation\\velocity\\chromedriver_win32\\chromedriver.exe");
	  WebDriver driver= new ChromeDriver();
	  driver.get("https://kite.zerodha.com/");
	  driver.manage().window().maximize();
  }
  @Test
  public void f3() {
	  System.setProperty("webdriver.chrome.driver", "D:\\Testing\\automation\\velocity\\chromedriver_win32\\chromedriver.exe");
	  WebDriver driver= new ChromeDriver();
	  driver.get("https://www.facebook.com/login/");
	  driver.manage().window().maximize();
  }
  
}
