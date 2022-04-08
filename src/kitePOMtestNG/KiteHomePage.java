package kitePOMtestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteHomePage {
	
	@FindBy(xpath ="//span[@class='user-id']") private WebElement UserID;
	@FindBy(xpath ="//a[@target='_self']") private WebElement logoutButton;

	public KiteHomePage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	public String getActualUserID() {
		// in this we are using TestNG assert thats why we are not using the if else statement
		String actualUserID = UserID.getText();
		return actualUserID;
	}
	
	public void clickOnLogoutButton() throws InterruptedException {
		UserID.click();
		Thread.sleep(2000);
		logoutButton.click();
	}
}

