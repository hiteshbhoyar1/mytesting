package selenium_study;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Firstcode1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Testing\\automation\\velocity\\chromedriver_win32\\chromedriver.exe");
		WebDriver k = new ChromeDriver();
		k.get("https://www.facebook.com/login/");
		//Thread.sleep(2000);
		//k.close();
		//Thread.sleep(2000);
		//k.manage().window().maximize();
		//Thread.sleep(2000);
		//k.manage().window().minimize();
		//Thread.sleep(2000);
		//Thread.sleep(2000);
		k.get("https://www.instagram.com/");
		//k.close();
		k.manage().window().maximize();
		
		Thread.sleep(2000);
		//k.manage().window().minimize();
		k.navigate().to("https://vctcpune.com/selenium/practice.html");
		k.navigate().back();
		Thread.sleep(2000);
		k.navigate().forward();
//		System.out.println(k.getTitle());
//		
//		String title = k.getTitle();
//		System.out.println("title of web page is "+title);
//		System.out.println(k.getCurrentUrl());
//		
//		String url= k.getCurrentUrl();
//		System.out.println("url of webpage is===>> "+url);
//		
		k.navigate().refresh();
	
	
		
		

	}

}
