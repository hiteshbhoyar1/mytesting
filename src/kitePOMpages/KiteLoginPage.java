package kitePOMpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLoginPage {
	@FindBy(id="userid") private WebElement userID;
	@FindBy(id="password") private WebElement password;
	@FindBy(xpath ="//button[@type='submit']") private WebElement logInButton;
	@FindBy(xpath ="//span[contains(text(),'User ID should')]") private WebElement userIDErrorMsg;
	@FindBy(xpath ="//span[contains(text(),'Password should be')]") private WebElement passwordErrorMsg;
	
	public KiteLoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void enterUserID(String UID) {
		userID.sendKeys(UID);
	}
	public void enterPassword(String PWD) {
		password.sendKeys(PWD);
	}
	public void clickOnLogInButton() {
		logInButton.click();
	}
	public String getActualErrorMsg() {
		String errormsg = userIDErrorMsg.getText();
		return errormsg;
	}
	public String getActualErrorMsg1() {
		String errorMsg = passwordErrorMsg.getText();
		return errorMsg;
	}
	

}
