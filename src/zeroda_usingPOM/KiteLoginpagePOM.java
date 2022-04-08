package zeroda_usingPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLoginpagePOM {
	//1.declaration of webelement.
	@FindBy(id="userid") private WebElement userId;
	@FindBy(id="password") private WebElement password;
	@FindBy(xpath="//button[@type='submit']") private WebElement logInButton;
	
	//2.constructor 
	public KiteLoginpagePOM(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//3.Methods
	public void senduserId() {
		userId.sendKeys("HD5857");
	}
	
	public void sendpassword() {
		password.sendKeys("Ajinkya@123");
	}
	
	public void clickOnLogInButton() {
		logInButton.click();
	}
}
