package zerodaappusingPOMandDDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Kiteloginpage {
	
	@FindBy(id="userid") private WebElement UserID;
	@FindBy(id="password") private WebElement Password;
	@FindBy(xpath ="//button[@type='submit']") private WebElement logInButton;
	public Kiteloginpage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void senduserid(String uid) {
		UserID.sendKeys(uid);
	}
	public void sendpassword(String pwd) {
		Password.sendKeys(pwd);
	}
	public void clickOnloginButton() {
		logInButton.click();
	}
	
	
	
	
	
	
}