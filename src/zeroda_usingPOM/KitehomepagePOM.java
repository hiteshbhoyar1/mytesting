package zeroda_usingPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KitehomepagePOM {
	//1. declaration 
	@FindBy(xpath="//span[@class='user-id']") private WebElement UserId;
	@FindBy(xpath="//a[@target='_self']") private WebElement logOutButton;
	
	//2.constructor
	
	public KitehomepagePOM(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//3.methods
	
	public void validation() {
		String actualtext = UserId.getText();
		String expectedtext = "HD5857";
		if(actualtext.equals(expectedtext)) {
			System.out.println("userid is match TC is passed");
		}
		else {
			System.out.println("userid is not match TC is failed ");
		}
	}
	public void clickonUserId() {
		UserId.click();
	}
	
	public void clickonlogOutButton() {
		logOutButton.click();
	}

}
