package assertINtestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class assertTrue {
  @Test
  public void asserttrue_study() {
	  
	  boolean result= true;
	  Assert.assertTrue(result, "result is false");
	  
  }
  
  @Test
  public void asserttrue_study1() {
	  
	  boolean result= false;
	  Assert.assertTrue(result, "result is false");
	  
  }
}
