package zerodaappusingPOMandDDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Kitepinpage {
	
	@FindBy(id="pin") private WebElement Pin;
	@FindBy(xpath =("//button[@type='submit']")) private WebElement continueButton;
	
	public Kitepinpage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void sendpin(String PIN) {
		Pin.sendKeys(PIN);
	}
	public void clickonContinueButton() {
		continueButton.click();
	}

}
