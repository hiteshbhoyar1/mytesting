package assertINtestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class assertFalse {
  @Test
  public void assertFalse_study() {
	  boolean result= false;
	  Assert.assertFalse(result, "result is true");
  }
  @Test
  public void assertFalse_study1() {
	  boolean result= true;
	  Assert.assertFalse(result, "result is true");
  }
}
