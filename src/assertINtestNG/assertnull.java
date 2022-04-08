package assertINtestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class assertnull {
  @Test
  public void assertNullstudy() {
	  String a=null;
	  
	  Assert.assertNull(a,"a is not null");
	 
  }
  
  @Test
  public void assertNullstudy1() {
	  String a="Hitesh";
	  
	  Assert.assertNull(a,"a is not null");
	 
  }
}
