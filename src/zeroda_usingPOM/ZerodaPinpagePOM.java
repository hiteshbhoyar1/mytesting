package zeroda_usingPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ZerodaPinpagePOM {
	//1. declaration
	@FindBy(id="pin") private WebElement pin;
	@FindBy(xpath="//button[@type='submit']") private WebElement continuebutton;
	
	//2.constructor
	public ZerodaPinpagePOM(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	//3.methods
	public void sendpin() {
		pin.sendKeys("866918");
	}
	public void clickoncontinuebutton() {
		continuebutton.click();
	}
}
