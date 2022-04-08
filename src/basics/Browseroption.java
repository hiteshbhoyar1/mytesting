package basics;

import org.openqa.selenium.chrome.ChromeOptions;

public class Browseroption {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Testing\\automation\\velocity\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions opt= new ChromeOptions();
		String browsername = opt.getBrowserName();
		String version = (String) opt.getCapability(browsername);
		
		String browserversion = opt.getBrowserVersion();
		System.out.println(browsername+" "+browserversion+" "+version);
	

	}

}
