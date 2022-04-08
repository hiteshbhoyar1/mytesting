package testNG_study;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG_Annotation {
  @Test
  public void first() {

	  Reporter.log("running first method",true);
  }
  @Test
  public void second() {
	  Reporter.log("running second method",true);
	  
  }
  @Test
  public void third() {
	  Reporter.log("running third method",true);
  }
  @BeforeClass
  public void browseropen() {
	  Reporter.log("opening the browser and give command to open url",true);
  }
  @AfterClass
  public void closebrowser() {
	  Reporter.log("close the browser",true);
  }
  @BeforeMethod
  public void loggingin(){
	  Reporter.log("logging into account",true);
  }
  @AfterMethod
  public void loggingout() {
	  Reporter.log("logging out the account",true);
  }
}
