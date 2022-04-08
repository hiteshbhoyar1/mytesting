package testNG_keywordstudy;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class priorityuse {
  @Test(priority = -1)
  public void a() {
	  Reporter.log("running first method",true);
  }
  @Test(priority = -2)
  public void c() {
	  Reporter.log("running second method",true);
  }
  @Test(priority = 0)
  public void b() {
	  Reporter.log("running third method",true);
  }
}
