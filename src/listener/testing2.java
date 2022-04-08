package listener;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class testing2 {
	public class testing {
		  @Test
		  public void p() {
			  Reporter.log("TC p is running",true);
		  }
		  @Test
		  public void q() {
			  Reporter.log("TC q is running",true);
			  Assert.fail();
		  }
		  @Test (dependsOnMethods = {"q"})
		  public void r() {
			  Reporter.log("TC r is running",true);
		  }
	}
}
