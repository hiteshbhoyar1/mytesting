package softassert;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class softassertequals {
	SoftAssert soft= new SoftAssert();
	
	 @Test
	  public void equals() {
		  String e= "sanket";
		  String f= "sanket";
		  soft.assertNotEquals(e, f, "e and f are equal");
		  soft.assertNull(f, "f is not null");
		
		  soft.assertAll();
	  }
	 
  @Test
  public void equals1() {
	  String a= "hitesh";
	  String b= "hitesh";
	  soft.assertNotEquals(a, b, "a and b are equal");
	  soft.assertNull(b,"b is not null");
	  soft.assertAll();
  }
  
  @Test
  public void equals2() {
	  String c= "tanmay";
	  String d= "tanmay";
	  soft.assertEquals(c, d, "c and d are not equal");
	  soft.assertNotNull(d,"d is null");
	  soft.assertAll();
//	  Assert.assertNotEquals(c, d,"c and d are equal");
//	  Assert.assertNull(d, "d is not null");
}
  
 
}