package groupinginTestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNGgrouping_study {
	@Test(groups = "regression")
	  public void TC1() {
		  Reporter.log("Running TC1",true);
	  }
	  @Test(groups = "sanity")
	  public void TC2() {
		  Reporter.log("Running TC2",true);
	  }
	  @Test(groups = "sanity")
	  public void TC3() {
		  Reporter.log("Running TC3",true);
	  }
	  @Test(groups = "regression")
	  public void TC4() {
		  Reporter.log("Running TC4",true);
	  }
	  @Test
	  public void TC5() {
		  Reporter.log("Running TC5",true);
	  }
}
