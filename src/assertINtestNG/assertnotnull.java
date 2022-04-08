package assertINtestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class assertnotnull {
  @Test
  public void assertNotNullstudy() {
	  String a ="hitesh";
	  Assert.assertNotNull(a,"a is null");
  }
  
  @Test
  public void assertNotNullstudy1() {
	  String a =null;
	  Assert.assertNotNull(a,"a is null");
}
}