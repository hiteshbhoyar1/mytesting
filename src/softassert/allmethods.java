package softassert;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class allmethods {
	SoftAssert soft = new SoftAssert();
  @Test
  public void assertequals() {
	  String a= "hitesh";
	  String b="hitesh";
	  String c="sanket";
	  soft.assertNotEquals(b, c,"b and c are not equal");
	  soft.assertEquals(a, b,"a and b are not equal");
	  soft.assertNotNull(b,"b is null");
	  soft.assertAll();  
  }
  @Test
  public void assertTrueFalse() {
	  boolean result= true;
	  boolean result1=false;
	  soft.assertTrue(result, "the result is false");
	  soft.assertFalse(result1,"the result is true");
	  soft.assertAll();
	  
  }
  @Test
  public void assertNullAndNotNull() {
	  String a="hitesh";
	  String b=null;
	  soft.assertNotNull(a,"a is null");
	  soft.assertNull(b,"b is not null");

	  soft.assertAll();
  }
}
