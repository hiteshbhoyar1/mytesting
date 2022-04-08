package zeroda_usingPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KitePinPagePOM {
	//1.declration
	@FindBy(id="pin") private WebElement pin;
	@FindBy(xpath="//button[@type='submit']") private WebElement pinButton;
	
	//2. constructor
	
	public KitePinPagePOM (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//3.methods
	
	public void sendpin() {
		pin.sendKeys("969696");
	}
	
	public void clickOnpinButton() {
		pinButton.click();
	}

}
