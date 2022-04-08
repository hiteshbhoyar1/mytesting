package kiteAppTestClasses;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Baseclasses.Base;
import kitePOMpages.KiteLoginPage;
import utilityPackage.KiteUtilityClass;

public class KiteUserNameErrorMsg extends Base {
	
	KiteLoginPage login;
	@BeforeClass
	public void browserLauch() {
		launchbrowser();
		login= new KiteLoginPage(driver);
		Reporter.log("browser launch successfully", true);
	}
	@BeforeMethod
	public void loginToKiteApp() throws EncryptedDocumentException, IOException {
		login.enterPassword(KiteUtilityClass.readDataFromExcel(0, 1));
		login.clickOnLogInButton();
		Reporter.log("clickon log in button", true);
	}
  @Test
  public void validationOfUserIDErrorMsg() throws EncryptedDocumentException, IOException {
	  int TCID=3;
	 String expectedUserIDErrorMsg = KiteUtilityClass.readDataFromExcel(0, 3);
	  String actualUserIDErrorMsg = login.getActualErrorMsg();
	  Assert.assertEquals(actualUserIDErrorMsg, expectedUserIDErrorMsg,"Userid error msg not matching");
	  KiteUtilityClass.takeScreenShot(driver, TCID);
	  Reporter.log("userIderror message validate successfully", true);
  }
  @AfterClass
  public void closing() {
	  closeBrowser();
  }
}
