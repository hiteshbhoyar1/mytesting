package assertINtestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class assertnotEquals {
	 @Test
	  public void assertstudy() {
		  
		  String name="Hitesh";
		  String name1="Hitesh1";
		  Assert.assertNotEquals(name, name1, "string is not matching");
}
	 
	 @Test
	  public void assertstudy1() {
		  
		  String name="Hitesh";
		  String name1="Hitesh";
		  Assert.assertNotEquals(name, name1, "string is not matching");
}
}
