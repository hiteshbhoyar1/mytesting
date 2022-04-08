package testNG_keywordstudy;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class timeout_use {
  @Test
  public void a() {
	  Reporter.log("running first method",true);
  }
  
  @Test(timeOut = 1000)
  public void b() throws InterruptedException {
	  Thread.sleep(1100);
	  Reporter.log("running second method",true);
  }
  
  @Test
  public void c() {
	  Reporter.log("running third method",true);
  }
  
}
