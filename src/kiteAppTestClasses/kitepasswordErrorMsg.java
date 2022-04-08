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

public class kitepasswordErrorMsg extends Base{
	KiteLoginPage login;
	@BeforeClass
	public void browserLaunch() {
		launchbrowser();
		Reporter.log("launching the browser");
		login = new KiteLoginPage(driver);
	}
	@BeforeMethod
	public void kiteAppLogin() throws EncryptedDocumentException, IOException {
		login.enterUserID(KiteUtilityClass.readDataFromExcel(0, 0));
		login.clickOnLogInButton();
	}
  @Test
  public void validatePasswordErrorMsg() throws EncryptedDocumentException, IOException {
	  int TCID=2;
	String expectederrormsg = KiteUtilityClass.readDataFromExcel(0, 4);
	String actualErrorMsg = login.getActualErrorMsg1();
	Assert.assertEquals(actualErrorMsg, expectederrormsg, "the password error message is not matching");
	KiteUtilityClass.takeScreenShot(driver, TCID);
	Reporter.log("password error message validate ", true);
	  
  }
  @AfterClass
  public void browserclosing() {
	  closeBrowser();
  }
}
