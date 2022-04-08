package testNG_keywordstudy;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class dependon_use1 {
  @Test(dependsOnMethods = {"b"})
  public void a() {
	  Reporter.log("running a method",true);
  }
  
  @Test
  public void b() {
	  Reporter.log("running b method",true);
  }
  
  @Test
  public void c() {
	  Reporter.log("running c method",true);
  }
}
