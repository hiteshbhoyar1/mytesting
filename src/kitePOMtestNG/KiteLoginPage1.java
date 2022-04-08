package kitePOMtestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLoginPage1 {
	@FindBy(id="userid") private WebElement userID;
	@FindBy(id="password") private WebElement password;
	@FindBy(xpath ="//button[@type='submit']") private WebElement loginButton;
	
	public KiteLoginPage1(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public void enteruserId(String UID) {
		userID.sendKeys(UID);
	}
	
	public void enterPassword(String PWD) {
		password.sendKeys(PWD);
	}
	
	public void clickOnLoginButoon() {
		loginButton.click();
	}

}
