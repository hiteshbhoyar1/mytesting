package zeroda_usingPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Zeroda_LoginpagePOM {
	//1 declaration 
	@FindBy(id="userid") private WebElement userId;
	@FindBy(id="password") private WebElement Password;
	@FindBy(xpath="//button[@type='submit']") private WebElement logInButton;
	
	//2. constructor
	public Zeroda_LoginpagePOM(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//3.methods
	
	public void senduserid() {
		userId.sendKeys("DAA677");
		
	}
	public void sendpassword() {
		Password.sendKeys("Velocity@123");
	}
	public void clickonloginbutton() {
		logInButton.click();
	}
	
}
