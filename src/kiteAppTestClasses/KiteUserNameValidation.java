package kiteAppTestClasses;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Baseclasses.Base;
import kitePOMpages.KiteHomePage;
import kitePOMpages.KiteLoginPage;
import kitePOMpages.KitePinPage;
import utilityPackage.KiteUtilityClass;


public class KiteUserNameValidation extends Base {

	KiteLoginPage login;
	KitePinPage pin;
	KiteHomePage home;
 
	
	
	@BeforeClass
	public void browserlaunch() {
		launchbrowser();
		login= new KiteLoginPage(driver);
		pin= new KitePinPage(driver);
		home= new KiteHomePage(driver);
		
	}
	
	@BeforeMethod
	public void loginToKiteApp() throws EncryptedDocumentException, IOException {
		login.enterUserID(KiteUtilityClass.readDataFromExcel(0, 0));
		login.enterPassword(KiteUtilityClass.readDataFromExcel(0, 1));
		login.clickOnLogInButton();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		pin.enterPin(KiteUtilityClass.readDataFromExcel(0, 2));
		pin.clickOnContinueButton();
	}
	@Test
  public void validateUserName() throws EncryptedDocumentException, IOException {
		int TCID=001;
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		String actualUserID = home.getActualUserID();
		String expectedUserID = KiteUtilityClass.readDataFromExcel(0, 0);
		Assert.assertEquals(actualUserID, expectedUserID,"the user id not matching");
		KiteUtilityClass.takeScreenShot(driver, TCID);
		Reporter.log("validate Username successfully", true);

  }
	@AfterMethod
	public void loggingoutKiteApp() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		home.clickOnLogoutButton();
	}
	@AfterClass
	public void browserClosing() {
		closeBrowser();
	}
}
