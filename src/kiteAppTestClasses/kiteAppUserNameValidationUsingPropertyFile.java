package kiteAppTestClasses;

import java.io.IOException;
import java.time.Duration;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Baseclasses.BaseUsingPropertyFile;
import kitePOMpages.KiteHomePage;
import kitePOMpages.KiteLoginPage;
import kitePOMpages.KitePinPage;
import utilityPackage.UtilityUsingPropertyFile;

public class kiteAppUserNameValidationUsingPropertyFile extends BaseUsingPropertyFile {
 KiteLoginPage login;
 KitePinPage pin;
 KiteHomePage home;
 int TCID=10;
	@BeforeClass
	public void launchingBrowser() throws IOException {
		launchBrowser();
		login= new KiteLoginPage(driver);
		pin= new KitePinPage(driver);
		home= new KiteHomePage(driver);
		
	}
	@BeforeMethod
	public void loginToKiteApp() throws IOException {
		login.enterUserID(UtilityUsingPropertyFile.getDataFromPropertyFile("UI"));
		login.enterPassword(UtilityUsingPropertyFile.getDataFromPropertyFile("PWD"));
		login.clickOnLogInButton();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		pin.enterPin(UtilityUsingPropertyFile.getDataFromPropertyFile("PIN"));
		pin.clickOnContinueButton();
	}
	@Test
  public void validationOfUserID() throws IOException {
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		String expectedUI = UtilityUsingPropertyFile.getDataFromPropertyFile("UI");
		String atualUI = home.getActualUserID();
		Assert.assertEquals(expectedUI, atualUI,"user id not matching");
		UtilityUsingPropertyFile.takeScreenShot(driver, TCID);
		Reporter.log("TC is passed",true);

  }
	@AfterMethod
	public void logoutFromKiteApp(ITestResult result) throws IOException, InterruptedException {
		if(result.getStatus()==result.FAILURE) {
			UtilityUsingPropertyFile.takeScreenShot(driver, TCID);
		}
		else {
			Reporter.log("TC is passed", true);
		}
		home.clickOnLogoutButton();
	}
	@AfterClass
	public void closingBrowser() {
		closeBrowser();
	}
}
