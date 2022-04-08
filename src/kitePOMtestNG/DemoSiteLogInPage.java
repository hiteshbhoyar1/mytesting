package kitePOMtestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DemoSiteLogInPage {
	@FindBy(xpath ="//input[@name='UserName']") private WebElement userID;
	@FindBy(xpath ="//input[@name='Password']") private WebElement password;
	@FindBy(id="login") private WebElement logInButton;
	
	public DemoSiteLogInPage (WebDriver driver) {
	
		PageFactory.initElements(driver, this);
	}
	
	
	public void enterUserID(String Userid) {
		userID.sendKeys(Userid);
	}
	public void enterPassword(String PassWord) {
		password.sendKeys(PassWord);
		
	}
	public void clickLogInButton() throws InterruptedException {
		logInButton.click();
		Thread.sleep(2000);
		logInButton.click();
	}

}
