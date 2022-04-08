package zeroda_usingPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ZerodaHomepagePOM {
	
	//1. declaration
	@FindBy(xpath="//span[@class='user-id']") private WebElement UserID;
	@FindBy(xpath="//a[@target='_self']") private WebElement logOutButton;
	
	//2. constructor
	public ZerodaHomepagePOM(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	//3.methods
	public void validation() {
	 String actualtext = UserID.getText();
		String expectedtext = "DAA677";
		if (actualtext.equals(expectedtext)) {
			System.out.println("the text is matched TC is passed");
		}
		else {
			System.out.println("the text is not matched TC is failed");
		}
	}
	public void clickonuserid() {
		UserID.click();
	}
	public void clickonlogoutbutton() {
		logOutButton.click();
	}
	

}
