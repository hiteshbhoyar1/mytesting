package assertINtestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertequals {
  @Test
  public void assertstudy() {
	  
	  String name="Hitesh";
	  String name1="Hitesh";
	  Assert.assertEquals(name, name1, "string is not matching");
			  
  }
  
  @Test
  public void assertstudy1() {
	  
	  String name="Hitesh";
	  String name1="Hitesh1";
	  Assert.assertEquals(name, name1, "string is not matching");
			  
  }
}
