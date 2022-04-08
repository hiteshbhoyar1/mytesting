package kitePOMpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteHomePage {
	
	@FindBy(xpath ="//span[@class='user-id']") private WebElement USERID;
	@FindBy(xpath ="//a[@target='_self']") private WebElement logoutButton;
	
	public KiteHomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public String getActualUserID() {
		String actualUserID = USERID.getText();
		return actualUserID;
	}
	public void clickOnLogoutButton() throws InterruptedException {
		USERID.click();
		Thread.sleep(1000);
		logoutButton.click();
	}

}
