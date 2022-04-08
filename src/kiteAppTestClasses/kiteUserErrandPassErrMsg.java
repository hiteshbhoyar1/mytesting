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

public class kiteUserErrandPassErrMsg extends Base {
	KiteLoginPage login;
	@BeforeClass
	public void browserLaunch() {
		launchbrowser();
		login= new KiteLoginPage(driver);	
	}
	@BeforeMethod
	public void kiteAppLogin() {
		login.clickOnLogInButton();
	}
  @Test
  public void validateUserErrorMsg() throws EncryptedDocumentException, IOException {
	  int TCID=4;
	  String actualusererrorMsg = login.getActualErrorMsg();
	 String expecteduderErrorMsg = KiteUtilityClass.readDataFromExcel(0, 3);
	 Assert.assertEquals(actualusererrorMsg, expecteduderErrorMsg,"user error msg not matching");
	 KiteUtilityClass.takeScreenShot(driver, TCID);
	 Reporter.log("Validate user error msg",true);
  }
  @Test
  public void validatePasswordErrorMsg() throws EncryptedDocumentException, IOException {
	  int TCID=05;
	 String actualPasswordErrMsg = login.getActualErrorMsg1();
	 String expectedPasswordErrMsg = KiteUtilityClass.readDataFromExcel(0, 4);
	 Assert.assertEquals(actualPasswordErrMsg, expectedPasswordErrMsg,"error messager does not match");
	 KiteUtilityClass.takeScreenShot(driver, TCID);
	 Reporter.log("validate password error message ",true);
  }
  
  
  @AfterClass
  public void close() {
	  closeBrowser();
  }
}
