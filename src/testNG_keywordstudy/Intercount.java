package testNG_keywordstudy;

import org.testng.Reporter;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Intercount {
  @Test(invocationCount = 3)
  public void first() {
	  Reporter.log("Running first method",true);
  }
  @BeforeMethod
  public void beforemethod() {
	  Reporter.log("running before method",true);
  }
}
