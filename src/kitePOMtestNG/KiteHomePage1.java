package kitePOMtestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteHomePage1 {
	@FindBy(xpath ="//span[@class='user-id']") private WebElement USERID;
	@FindBy(xpath ="//a[@target='_self']") private WebElement logoutButton;
	
	public  KiteHomePage1(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public String actualUserid(String actualUserID) {
		String actualID = USERID.getText();
		return actualID;
	}
	public void clickOnLogoutButton() throws InterruptedException {
		USERID.click();
		Thread.sleep(2000);
		logoutButton.click();
	}

}
