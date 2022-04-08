package assertINtestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class assertFail {
	 @Test
	  public void assertFailstudy1() {
		  String a="hitesh";
		  String b=null;
		  Assert.fail();
		  Assert.assertNotNull(a,"a is null");
		  System.out.println("a is not null");
		  Assert.assertNull(b,"b is not null");
		  System.out.println("b is null");
		 
	  }
	
  @Test
  public void assertFailstudy() {
	  String a="hitesh";
	  String b=null;
	  Assert.assertNotNull(a,"a is null");
	  System.out.println("a is not null");
	  Assert.assertNull(b,"b is not null");
	  System.out.println("b is null");
	  Assert.fail();
  }
}
