package zerodaappusingPOMandDDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteHomepage {
	
	@FindBy(xpath ="//span[@class='user-id']") private WebElement myID;
	@FindBy(xpath ="//a[@target='_self']") private WebElement logoutButton;
	
	public KiteHomepage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public void validationofid(String id) {
		String expecteduserid = id;
		String actualuserid = myID.getText();
		if (actualuserid.equals(expecteduserid)) {
			System.out.println("text is match TC is passed");
			
		}
		else {
			System.out.println("the text is not match TC is failed");
		}
		
	}
	public void clickOnLogoutButton() throws InterruptedException {
		myID.click();
		Thread.sleep(2000);
		logoutButton.click();
	}

}
