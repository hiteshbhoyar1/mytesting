package listener;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class testing1 {
	public class testing {
		  @Test
		  public void a() {
			  Reporter.log("TC a is running",true);
		  }
		  @Test
		  public void b() {
			  Reporter.log("TC b is running",true);
			  Assert.fail();
		  }
		  @Test (dependsOnMethods = {"b"})
		  public void c() {
			  Reporter.log("TC c is running",true);
		  }
}
}
