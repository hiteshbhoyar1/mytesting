package failedinTestNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Failedclass1 {
	 @Test
	  public void TC1() {
		  Reporter.log("Running TC1",true);
	  }
	  @Test(timeOut = 200)
	  public void TC2() throws InterruptedException {
		  Thread.sleep(100);
		  Reporter.log("Running TC2",true);
	  }
	  @Test
	  public void TC3() {
		//  Assert.fail();
		  Reporter.log("Running TC3",true);
	  }
	  @Test
	  public void TC4() {
		  Reporter.log("Running TC4",true);
	  }
	  @Test
	  public void TC5() {
		  Reporter.log("Running TC5",true);
	  }
}
